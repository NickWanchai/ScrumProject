package com.example.demo.Repository;

import com.example.demo.Model.ICrud;

import java.sql.Connection;
import java.util.ArrayList;

public class EmployeeRepository implements ICrud {


    @Override
    public void create(Object o) {
        Connection connetion = DBConnectionManager.getConnection();
        String SQL = "INSERT INTO ";
    }

    @Override
    public ArrayList read() {
        return null;
    }

    @Override
    public void update(Object o, int index) {

    }

    @Override
    public void delete(int index) {

    }
}
