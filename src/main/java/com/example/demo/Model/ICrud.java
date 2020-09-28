package com.example.demo.Model;

public interface ICrud {

    void create(Object o);
    Object read(int index);
    void update(Object o, int index);
    void delete(int index);
}
