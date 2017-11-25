package com.liushiyao.spring.pojo.xml;

import java.util.List;

public class Student {

  private String id;
  private List<User> userList;




  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<User> getUserList() {
    return userList;
  }

  public void setUserList(List<User> userList) {
    this.userList = userList;
  }
}
