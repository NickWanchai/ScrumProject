package com.example.demo.Repository;

import com.example.demo.Model.Booking;
import com.example.demo.Model.ICrud;
import com.example.demo.Model.Movie;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class BookingRepository implements ICrud<Booking> {

    Booking booking = new Booking();


    @Override
    public void create(Booking booking) {

        try{
            LocalDate date = booking.getDateOfMovie();
            Date SQLdate = Date.valueOf(date);
            Connection connection = DBConnectionManager.getConnection();
            String SQL ="INSERT INTO movie_booking VALUES(DEFAULT,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1,booking.getMovieId());
            ps.setDate(2, SQLdate);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList read() {
        ArrayList<Booking> bookings = new ArrayList<>();

        try{
            Connection connection = DBConnectionManager.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM movie_booking";
            ResultSet rs = statement.executeQuery(sql);

            int bookingId;
            int movieId;
            Booking booking;
            LocalDate dateOfMovie;



            while(rs.next()){
                bookingId = rs.getInt("booking_id");
                //movieId = rs.getInt("id");
                booking = new Booking(bookingId);
                bookings.add(booking);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return bookings;
    }


    @Override
    public void update(Booking o, int index) {

    }



    @Override
    public void delete(int index) {

    }
}
