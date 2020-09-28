package com.example.demo.Model;

public interface ICrud <T>{

    void create(T o);
    Object read(int index);
    void update(T o, int index);
    void delete(int index);
}
