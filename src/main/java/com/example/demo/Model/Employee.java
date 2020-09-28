package com.example.demo.Model;

public class Employee {

    //Attributes
    private String name;
    private int id;

    //Methods

    public Employee(){}

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
