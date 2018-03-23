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
// import com.wisedu.cpdaily.hotguy.repository.VisitingRecordRepository;
//
// @Component
// public class VisitingRecordsUpdater {
//
// private static final Logger logger = LoggerFactory.getLogger(VisitingRecordsUpdater.class);
//
// private final ExecutorService updateExecutorService;
//
// // private final AtomicBoolean updateStopped;
//
// @Autowired
// private VisitingRecordRepository repository;
//
// public VisitingRecordsUpdater() {
// updateExecutorService = Executors.newFixedThreadPool(200);
// // updateStopped = new AtomicBoolean(false);
// }
//
// public void executeUpdateTask(String day) {
// UpdateTask task = new UpdateTask(day);
//
// updateExecutorService.execute(task);
// }
//
// private class UpdateTask implements Runnable {
//
// private String updateDay;
//
// UpdateTask(String updateDay) {
// this.updateDay = updateDay;
// }
//
// @Override
// public void run() {
// logger.info("{} update begins.", updateDay);
//
// long beginMillis = System.currentTimeMillis();
//
// List<VisitingRecord> records = repository.findByOpday(updateDay);
//
// if (records != null && !records.isEmpty()) {
//
// logger.info("update size is {}.", records.size());
//
// for (VisitingRecord record : records) {
//
// if (record.getStatus() == null) {
// record.setStatus(0);
// }
//
// repository.save(record);
// }
// }
//
// long endMillis = System.currentTimeMillis();
// long costTime = endMillis - beginMillis;
//
// logger.info("{} update ends, cost time is {} ms.", updateDay, Long.toString(costTime));
// }
// }
//
// }
