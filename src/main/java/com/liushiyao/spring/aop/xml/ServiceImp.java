package com.liushiyao.spring.aop.xml;

public class ServiceImp implements MyService {

  private String name;
  private Integer id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public void show() {
    System.out.println("show running");
  }
}
