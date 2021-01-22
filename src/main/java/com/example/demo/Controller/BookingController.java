package com.example.demo.Controller;

import com.example.demo.Model.Booking;
import com.example.demo.Model.Movie;
import com.example.demo.Repository.BookingRepository;
import com.example.demo.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class BookingController {

    BookingRepository bookingRepository = new BookingRepository();
    MovieRepository movieRepository = new MovieRepository();


    @GetMapping("/booking")
    public String booking(Model model) {
        model.addAttribute("booking", bookingRepository.read());
        return "booking";
    }

    @GetMapping("/addBooking")
    public String addBooking(Model model) {
        model.addAttribute("booking", new Booking());
        model.addAttribute("movies", movieRepository.read());

        return "addBooking";
    }

    @PostMapping("/addBooking")
    public String addBooking(HttpServletRequest request) {
        int movieId = Integer.parseInt(request.getParameter("movieId"));
        ;
        String date = request.getParameter("dateOfMovie");
        String seat = request.getParameter("seat");
        LocalDate dateOfMovie = convertDate(date);
        Booking booking = new Booking(movieId, dateOfMovie, seat);

        bookingRepository.create(booking);

        return "redirect:/booking";
    }

    public LocalDate convertDate(String date) {

        String split[] = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        return LocalDate.of(year, month, day);
    }


}
