package com.gxb.aop.ResponseJson;

public class SessionException extends Exception {

  /**
   *
   */
  private static final long serialVersionUID = -6867165720650881604L;

  public SessionException(String msg) {
    super(msg);
  }

  public SessionException(Exception e) {
    super(e);
  }
}
