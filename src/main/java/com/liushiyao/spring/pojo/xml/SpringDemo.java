package com.liushiyao.spring.pojo.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

  public static void main(String[] a) {

  }

  /**
   * 获取bean
   */
  @Test
  public void demo1() {

    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    User user = (User) applicationContext.getBean("user1");
    System.out.println(user.getName());

  }

  /**
   * 从集合中获取bean
   */
  @Test
  public void demo2(){

    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    Student student = (Student) applicationContext.getBean("student");
    System.out.println(student.getId());
    for (User user:student.getUserList()){
      System.out.println(user.getName());
    }

  }

}
