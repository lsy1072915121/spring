package com.liushiyao.spring.pojo.xml;


public class User {

  private String name;
  private Integer age;
  private Integer score;

  public User() {
  }

  public User(String name, Integer age, Integer score) {
    this.name = name;
    this.age = age;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }
}
