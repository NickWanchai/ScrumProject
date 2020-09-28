package com.example.demo.Controller;

import com.mysql.jdbc.Driver;
import com.example.demo.Model.Movie;
import com.example.demo.Repository.MovieRepository;

public class Main {

    public static void main(String[] args) throws Exception{
        Movie m = new Movie("Batman", 2000, 100);
        MovieRepository mR = new MovieRepository();

        //mR.create(m);
        System.out.println(mR.read(1));
    }
}
