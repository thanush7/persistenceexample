package com.kgisl.hibernatexml;
// @Table(name = "books")
public class Book {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
   public Book(){}
   public Book(int i,String name, String description) {
    this.id=i;
    this.name = name;
    this.description = description;
}

    public Book(String name, String description) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
