package com.spring.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {

  private int id;
  @NotEmpty(message = "Name should not be empty!!!")
  @Size(min = 1, max = 20, message = "Name's length should be between 1 and 20!!!")
  private String name;
  @Min(value = 18, message = "Go home, kid!!!")
  @Max(value = 50, message = "Go home, old men!!!")
  private int age;

  private String address;

  public Person() {
  }

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Person(int id, String name, int age, String address) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
