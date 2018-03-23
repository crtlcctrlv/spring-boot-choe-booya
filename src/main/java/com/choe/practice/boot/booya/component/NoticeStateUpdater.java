package com.choe.practice.boot.booya.component;
// package com.wisedu.cpdaily.hotguy.component;
//
// import java.util.List;
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;
//
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
//
// import com.wisedu.cpdaily.hotguy.entity.cassandra.VisitingRecord;
// import com.wisedu.cpdaily.hotguy.entity.cassandra.VisitingRecordBak;
// import com.wisedu.cpdaily.hotguy.entity.cassandra.VisitingRecordKey;
// import com.wisedu.cpdaily.hotguy.entity.cassandra.VisitingRecordKeyBak;
// import com.wisedu.cpdaily.hotguy.repository.NoticStateRepository;
//
// @Component
// public class NoticeStateUpdater {
//
// private static final Logger logger = LoggerFactory.getLogger(NoticeStateUpdater.class);
//
// private final ExecutorService executorService;
//
// @Autowired
// private NoticStateRepository repository;
//
// public NoticeStateUpdater() {
// executorService = Executors.newFixedThreadPool(10);
// }
//
// public void executeUpdateTask(String day) {
// UpdateTask task = new UpdateTask(day);
//
// executorService.execute(task);
// }
//
// private class UpdateTask implements Runnable {
//
// private String bakDay;
//
// UpdateTask(String updateDay) {
// bakDay = updateDay;
// }
//
// @Override
// public void run() {
// logger.info("{} bak begins.", bakDay);
//
// long beginMillis = System.currentTimeMillis();
//
// List<VisitingRecord> records = repository.findByOpday(bakDay);
//
// if (records != null && !records.isEmpty()) {
//
// logger.info("bak size is {}.", records.size());
//
// for (VisitingRecord record : records) {
//
// VisitingRecordBak bak = new VisitingRecordBak();
// VisitingRecordKeyBak key = new VisitingRecordKeyBak();
//
// VisitingRecordKey originKey = record.getVisitingRecordKey();
// key.setUserid(originKey.getUserid());
// key.setOptime(originKey.getOptime());
// key.setVisitor(originKey.getVisitor());
//
// bak.setVisitingRecordKeyBak(key);
//
// bak.setOptype(record.getOptype());
// bak.setOpday(record.getOpday());
// bak.setStatus(0);
//
// bakRepository.save(bak);
// }
// }
//
// long endMillis = System.currentTimeMillis();
// long costTime = endMillis - beginMillis;
//
// logger.info("{} bak ends, cost time is {} ms.", bakDay, Long.toString(costTime));
// }
// }
// }
