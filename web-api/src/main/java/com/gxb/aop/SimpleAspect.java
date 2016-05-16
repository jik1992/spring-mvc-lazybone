package com.gxb.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SimpleAspect implements InitializingBean {

  @Pointcut("within(com.gxb.service..*)")
  public void pointCut() {
  }


  @After("pointCut()")
  public void after(JoinPoint joinPoint) {
    System.out.println("after aspect executed");
  }

  @Before("pointCut()")
  public void before(JoinPoint joinPoint) {
    System.out.println("before aspect executing");
  }

  @Around("pointCut()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("around start..");
    try {
      return pjp.proceed();
    } catch (Throwable ex) {
      System.out.println("error in around");
      throw ex;
    }
  }

  @AfterThrowing(pointcut = "pointCut()", throwing = "error")
  public void afterThrowing(JoinPoint jp, Throwable error) {
    System.out.println("error:" + error);
  }

  public void afterPropertiesSet() throws Exception {
    System.out.println("拦截器启动");
  }
}
