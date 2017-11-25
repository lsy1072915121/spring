package com.liushiyao.spring.aop.xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
    环绕通知
 */
public class MyMethodAround implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    System.out.println("方法前调用");
    Object object = methodInvocation.proceed();   //方法执行
    System.out.println("方法后调用");
    return object;      //必须放回Object
  }
}
