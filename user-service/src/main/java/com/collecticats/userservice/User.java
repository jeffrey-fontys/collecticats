package com.collecticats.userservice;

import org.springframework.data.annotation.Id;

public class User {

  @Id private String id;

  private String username;
  private String email;
  
  public String getUsername() {
    return username;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setUsername(String username) {
    this.username = username;
  }
}
