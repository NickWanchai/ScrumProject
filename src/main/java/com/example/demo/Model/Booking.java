package com.example.demo.Model;

import java.time.LocalDate;

public class Booking {


    private int bookingId;
    private int movieId;
    private LocalDate dateOfMovie;


    public Booking(int bookingId) {
        this.bookingId = bookingId;
    }


    public Booking(int movieId, LocalDate dateOfMovie) {
        this.movieId = movieId;
        this.dateOfMovie = dateOfMovie;
    }

    public Booking(int bookingId, int movieId) {
        this.bookingId = bookingId;
        this.movieId = movieId;
    }

    public Booking(int bookingId, int movieId, LocalDate dateOfMovie) {
        this.bookingId = bookingId;
        this.movieId = movieId;
        this.dateOfMovie = dateOfMovie;
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
