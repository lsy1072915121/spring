package com.liushiyao.spring.aop.annotation;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {


  @Before("execution(* com.liushiyao.spring.aop.annotation.service.*(..)))")
  public void beforeMethod(){

    System.out.println("前置通知执行");


  }

  @After("execution(public void com.liushiyao.spring.aop.annotation.service.MyService.*(..)))")
  public void afterMethod(){

    System.out.println("后置通知执行");

  }


}
