package com.liushiyao.spring.aop.xml;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/*
    实现后置通知
 */
public class MyMethodAfter implements AfterReturningAdvice {

  @Override
  public void afterReturning(Object o, Method method, Object[] objects, Object o1)
      throws Throwable {
    System.out.println("后置通知运行。。。");
  }
}
