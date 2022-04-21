package com.collecticats.userservice;

import java.util.List;

import org.springframework.data.annotation.Id;

public class User {

  @Id
  private String id;

  private String authId;
  private List<String> cats;
  private List<User> friends;

  public String getAuthId() {
    return authId;
  }
  public void setAuthId(String authId) {
    this.authId = authId;
  }
  public List<String> getCats() {
    return cats;
  }
  public void setCats(List<String> cats) {
    this.cats = cats;
  }
  public List<User> getFriends() {
    return friends;
  }
  public void setFriends(List<User> friends) {
    this.friends = friends;
  }
}
