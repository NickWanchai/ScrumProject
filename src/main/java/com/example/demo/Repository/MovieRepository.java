package com.example.demo.Repository;

import com.example.demo.Model.Employee;
import com.example.demo.Model.ICrud;
import com.example.demo.Model.Movie;

import java.sql.*;
import java.util.ArrayList;

public class MovieRepository implements ICrud<Movie> {

    @Override
    public void create(Movie movie) {
        try{
        Connection connection = DBConnectionManager.getConnection();
        String SQL = "INSERT INTO movie VALUES(DEFAULT, ?,?,?)";
        PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,movie.getName());
        ps.setInt(2, movie.getYear());
        ps.setInt(3, movie.getPrice());
        ps.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Object read(int index) {
        ArrayList<Movie> movies = new ArrayList<>();

        try{
            Connection connection = DBConnectionManager.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM movie";
            ResultSet rs = statement.executeQuery(sql);
            int id;
            String name;
            int year;
            int price;
            Movie movie;

            while(rs.next()){
                id = rs.getInt("autocamper_id");
                name = rs.getString("movie_name");
                year = rs.getInt("movie_year");
                price = rs.getInt("movie_price");
                movie = new Movie(id, name, year, price);
                movies.add(movie);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return movies;
    }


    @Override
    public void update(Movie o, int index) {

    }


    @Override
    public void delete(int index) {
        try{
            Connection connection = DBConnectionManager.getConnection();
            String sql = "DELETE FROM movie WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,index);
            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
