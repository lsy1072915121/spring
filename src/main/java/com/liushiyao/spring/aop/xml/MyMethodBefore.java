package com.liushiyao.spring.aop.xml;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;


/*
    实现前置通知
 */

public class MyMethodBefore implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] objects, Object o) throws Throwable {
    System.out.println("前置通知运行。。。");
  }
}
