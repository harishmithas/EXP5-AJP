package com.swagger.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movie")
public class MovieController {
    private static List<Movie> movies = new ArrayList<Movie>();
    @GetMapping
        public List<Movie> getMovies() {
         return movies;
    }
    
    @PostMapping
    public Movie addUser(@RequestBody Movie movie){
        movies.add(movie);
        return movie;
    }
}