package com.collecticats.catservice;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Cat {

  @Id
  private String id;

  private String name;
  private String description;
  private boolean canBreed;
  private Date lastBred;
  private int rarity;
  private String owner;
  private String[] parents;
  private String[] children;
  private String dna;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public boolean isCanBreed() {
    return canBreed;
  }
  public void setCanBreed(boolean canBreed) {
    this.canBreed = canBreed;
  }
  public Date getLastBred() {
    return lastBred;
  }
  public void setLastBred(Date lastBred) {
    this.lastBred = lastBred;
  }
  public int getRarity() {
    return rarity;
  }
  public void setRarity(int rarity) {
    this.rarity = rarity;
  }
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }
  public String[] getParents() {
    return parents;
  }
  public void setParents(String[] parents) {
    this.parents = parents;
  }
  public String[] getChildren() {
    return children;
  }
  public void setChildren(String[] children) {
    this.children = children;
  }
  public String getDna() {
    return dna;
  }
  public void setDna(String dna) {
    this.dna = dna;
  }
}
