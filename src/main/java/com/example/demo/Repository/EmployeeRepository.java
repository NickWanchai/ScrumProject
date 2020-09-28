package com.example.demo.Repository;

import com.example.demo.Model.ICrud;

import java.sql.Connection;

public class EmployeeRepository implements ICrud {


    @Override
    public void create(Object o) {
        Connection connetion = DBConnectionManager.getConnection();
        String SQL = "INSERT INTO ";
    }

    @Override
    public Object read(int index) {
        return null;
    }

    @Override
    public void update(Object o, int index) {

    }

    @Override
    public void delete(int index) {

    }
}
