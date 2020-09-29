package com.example.demo.Model;

import java.util.ArrayList;

public interface ICrud <T>{

    void create(T o);
    ArrayList<T> read();
    void update(T o, int index);
    void delete(int index);
}
