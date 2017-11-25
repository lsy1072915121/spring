package com.liushiyao.spring.aop.annotation.service;


import org.springframework.stereotype.Component;

@Component("myServiceImp")
public class MyServiceImp implements MyService {

  @Override
  public void show() {
    System.out.println("MyServiceImp Running");
  }
}
