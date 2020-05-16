package com.entity;

public class Person {
    public Person(Integer id, String name, Integer age ) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(){}

    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
