package com.example.demo.Model;

public class Movie {

    //Attributes
    private int id;
    private String name;
    private int year;
    private int price;

    public Movie(String name, int year, int price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public Movie(int id, String name, int year, int price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public Movie(){}

    //Getter/Setter


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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
