package com.collecticats.catservice;

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document
public class Cat {

  @Id private String id;
  
  private String name;
  private String description;
  private String image;
  private boolean canBreed;
  private Date lastBred;
  private int timesBred;
  private int rarity;
  private String owner;
  @DocumentReference private List<Cat> parents;
  @DocumentReference private List<Cat> children;
  private String dna;
  
  public String getId() {
      return id;
    }
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
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
  public List<Cat> getParents() {
    return parents;
  }
  public void setParents(List<Cat> parents) {
    this.parents = parents;
  }
  public List<Cat> getChildren() {
    return children;
  }
  public void setChildren(List<Cat> children) {
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
