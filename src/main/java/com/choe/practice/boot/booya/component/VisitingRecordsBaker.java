package com.choe.practice.boot.booya.component;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.choe.practice.boot.booya.entity.cassandra.VisitingRecord;
import com.choe.practice.boot.booya.entity.cassandra.VisitingRecordBak;
import com.choe.practice.boot.booya.entity.cassandra.VisitingRecordKey;
import com.choe.practice.boot.booya.entity.cassandra.VisitingRecordKeyBak;
import com.choe.practice.boot.booya.repository.VisitingRecordBakRepository;
import com.choe.practice.boot.booya.repository.VisitingRecordRepository;

@Component
public class VisitingRecordsBaker {

  private static final Logger logger = LoggerFactory.getLogger(VisitingRecordsBaker.class);

  private final ExecutorService bakExecutorService;

  // private final AtomicBoolean updateStopped;

  @Autowired
  private VisitingRecordRepository repository;

  @Autowired
  private VisitingRecordBakRepository bakRepository;

  public VisitingRecordsBaker() {
    bakExecutorService = Executors.newFixedThreadPool(10);
    // updateStopped = new AtomicBoolean(false);
  }

  public void executeUpdateTask(String day) {
    UpdateTask task = new UpdateTask(day);

    bakExecutorService.execute(task);
  }

  private class UpdateTask implements Runnable {

    private String bakDay;

    UpdateTask(String updateDay) {
      bakDay = updateDay;
    }

    @Override
    public void run() {
      logger.info("{} bak begins.", bakDay);

      long beginMillis = System.currentTimeMillis();

      List<VisitingRecord> records = repository.findByOpday(bakDay);

      if (records != null && !records.isEmpty()) {

        logger.info("bak size is {}.", records.size());

        for (VisitingRecord record : records) {

          VisitingRecordBak bak = new VisitingRecordBak();
          VisitingRecordKeyBak key = new VisitingRecordKeyBak();

          VisitingRecordKey originKey = record.getVisitingRecordKey();
          key.setUserid(originKey.getUserid());
          key.setOptime(originKey.getOptime());
          key.setVisitor(originKey.getVisitor());

          bak.setVisitingRecordKeyBak(key);

          bak.setOptype(record.getOptype());
          bak.setOpday(record.getOpday());
          bak.setStatus(record.getStatus());
          bak.setVisitdesc("");

          bakRepository.save(bak);
        }
      }

      long endMillis = System.currentTimeMillis();
      long costTime = endMillis - beginMillis;

      logger.info("{} bak ends, cost time is {} ms.", bakDay, Long.toString(costTime));
    }
  }

}
