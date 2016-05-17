package com.gxb.aop.ResponseJson;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 有关数据的包装拦截器
 *
 * @author zuoyun
 */
@Component
@Aspect
public class ResponseDataWrapperAspect implements InitializingBean {


  @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping) && execution(* com.gxb.controller.DemoController.*(..))")
  public void aspect() {
  }


  @Around("aspect()")
  public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
    Long startTime = System.currentTimeMillis();
    Object result = null;
    Exception ex = null;

    Object target = joinPoint.getTarget();
    // 获取SessionableController，如果为空，则表示target不能获取User

    try {
      result = joinPoint.proceed(joinPoint.getArgs());
//      // 一般响应到页面时，返回的内容一般都是字符串类型
//      if (result instanceof String) {
//        return result;
//      }
//
//      if (result instanceof ResponseDataWrapper) {
//        return result;
//      }
      return ResponseDataWrapperBuilder.build(getApiName(joinPoint.getArgs()), result == null ? new Object() : result);
    } catch (Exception e) {
      return new ErrorHandler().errorResponse(getApiName(joinPoint.getArgs()), e);
    } finally {
      Long speedTime = System.currentTimeMillis() - startTime;
      System.out.println("请求消费时间 " + speedTime + " ms");
    }
  }


  private String getApiName(Object[] args) {
    return "demo";
  }

  public void afterPropertiesSet() throws Exception {
    System.out.println("全局接口拦截器 启动");
  }
}
