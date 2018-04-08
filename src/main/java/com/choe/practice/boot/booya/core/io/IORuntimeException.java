package com.choe.practice.boot.booya.core.io;

/**
 * IO运行时异常
 */
public class IORuntimeException extends RuntimeException {

  private static final long serialVersionUID = 1704290374381512660L;

  public IORuntimeException(Throwable e) {
    super(e);
  }

  public IORuntimeException(String message) {
    super(message);
  }

  public IORuntimeException(String message, Throwable throwable) {
    super(message, throwable);
  }

}
