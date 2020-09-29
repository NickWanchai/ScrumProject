package com.example.demo.Controller;

import com.example.demo.Model.Movie;
import com.example.demo.Repository.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MovieController {

    private MovieRepository mRepo = new MovieRepository();

    @GetMapping("/movies")
    public String customers(Model model){
        model.addAttribute("movies", mRepo.read());
        return "movies";
    }

    @GetMapping("/addMovie")
    public String addMovie(Model model){
        model.addAttribute("movie", new Movie());
        return "addMovie";
    }

    @PostMapping("/addMovie")
    public String addMovie(HttpServletRequest request){
        String name = request.getParameter("movieName");
        int year = Integer.parseInt(request.getParameter("movieYear"));
        int price = Integer.parseInt(request.getParameter("moviePrice"));;
        Movie movie = new Movie(name, year, price);
        mRepo.create(movie);
        return "redirect:/movies";
    }

}
