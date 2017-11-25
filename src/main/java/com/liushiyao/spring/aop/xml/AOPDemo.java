package com.liushiyao.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
    使用的是XML格式配置的


 */
public class AOPDemo {

  public static void main(String[] a) {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "applicationContext2.xml");

    MyService serviceImp = (MyService) applicationContext.getBean("proxyFactoryBean");
    serviceImp.show();

  }


}
