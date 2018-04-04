package com.choe.practice.boot.booya.core.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class BooyaThreadFactory implements ThreadFactory {

  private static final ThreadGroup threadGroup = new ThreadGroup("Booya");

  private final AtomicLong threadNumber = new AtomicLong(1);

  private final String namePrefix;

  private final boolean daemon;

  private BooyaThreadFactory(String namePrefix, boolean daemon) {
    this.namePrefix = namePrefix;
    this.daemon = daemon;
  }

  public static ThreadGroup getThreadGroup() {
    return threadGroup;
  }

  public static ThreadFactory create(String namePrefix, boolean daemon) {
    return new BooyaThreadFactory(namePrefix, daemon);
  }

  /**
   * Creates a new {@link Thread}
   *
   * @see java.util.concurrent.ThreadFactory#newThread(java.lang.Runnable)
   */
  @Override
  public Thread newThread(Runnable r) {

    Thread thread = new Thread(threadGroup, r,
        threadGroup.getName() + "-" + namePrefix + "-" + threadNumber.getAndIncrement());

    thread.setDaemon(daemon);
    if (thread.getPriority() != Thread.NORM_PRIORITY) {
      thread.setPriority(Thread.NORM_PRIORITY);
    }
    return thread;
  }

}
