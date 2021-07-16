package com.springboot.basics.springbootin10steps;

public class Book {
  long id;
  String name;
  String autor;
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public Book(long id, String name, String autor) {
    this.id = id;
    this.name = name;
    this.autor = autor;
  }

  
}
