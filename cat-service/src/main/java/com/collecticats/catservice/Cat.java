package com.collecticats.catservice;

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Date;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cat {

  @Id
  private String id;

  private String name;
  private String description;
  private Binary image;
  private boolean canBreed;
  private Date lastBred;
  private int timesBred;
  private int rarity;
  private String owner;
  private String[] parents;
  private String[] children;
  private String dna;

  public Binary getImage() {
    return image;
  }
  public void setImage(Binary image) {
    this.image = image;
  }
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
  public int getTimesBred() {
    return timesBred;
  }
  public void setTimesBred(int timesBred) {
    this.timesBred = timesBred;
  }

  // public void addChild(Cat cat){
  //   ArrayList<Cat> newArr = new ArrayList<Cat>(Arrays.asList(this.children));
  //   newArr.add(cat);
  //   this.children = newArr.toArray(this.children);
  // }
}
