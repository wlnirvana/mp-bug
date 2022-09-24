package org.example;

import com.baomidou.mybatisplus.annotation.TableId;

public class Person {

  @TableId
  private Integer id;

  private String name;

  public Person() {}

  public Person(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
