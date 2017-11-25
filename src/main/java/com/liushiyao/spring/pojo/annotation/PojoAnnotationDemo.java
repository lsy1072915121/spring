package com.liushiyao.spring.pojo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    使用注解的方式配置bean

 */
public class PojoAnnotationDemo {


  public static void main(String []a){

    ApplicationContext applicationContext
        =new ClassPathXmlApplicationContext("applicationContext4.xml");
    Person person = (Person) applicationContext.getBean("person");

    System.out.println(person.getName());
    System.out.println(person.getAge());
    person.show();

  }

}
