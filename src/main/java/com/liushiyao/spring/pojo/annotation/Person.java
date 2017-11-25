package com.liushiyao.spring.pojo.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Person {


  @Value("liushiyao")
  private String name;
  private Integer age;

  @Autowired
  private User user;

  public void show(){

    System.out.println("Person Name："+this.name+" User Name："+user.getName());

  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

}
