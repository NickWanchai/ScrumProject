package com.example.demo.Model;

import java.time.LocalDate;

public class Booking {


    private int bookingId;
    private int movieId;
    private LocalDate dateOfMovie;

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    private String seat;


    public Booking(int bookingId) {
        this.bookingId = bookingId;
    }


    public Booking(int movieId, LocalDate dateOfMovie, String seat) {
        this.movieId = movieId;
        this.dateOfMovie = dateOfMovie;
        this.seat = seat;
    }

    public Booking(int bookingId, int movieId, String seat) {
        this.bookingId = bookingId;
        this.movieId = movieId;
        this.seat = seat;
    }

    public Booking(int bookingId, int movieId, LocalDate dateOfMovie, String seat) {
        this.bookingId = bookingId;
        this.movieId = movieId;
        this.dateOfMovie = dateOfMovie;
        this.seat = seat;
    }

    public Booking() {
    }


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public LocalDate getDateOfMovie() {
        return dateOfMovie;
    }

    public void setDateOfMovie(LocalDate dateOfMovie) {
        this.dateOfMovie = dateOfMovie;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingNo=" + bookingId +
                ", movieNo=" + movieId +
                ", dateOfMovie=" + dateOfMovie +
                '}';
    }
}
