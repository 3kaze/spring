package com.wzw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** @author wei */
@Data
public class Student {
  private Integer id;
  private String name;
  private Integer age;
  private Classes classes;

  public Student() {
    System.out.println("通过无参构造创建对象");
  }

  public Student(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
    System.out.println("通过有参构造创建对象");
  }

}
