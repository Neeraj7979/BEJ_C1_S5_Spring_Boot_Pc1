package com.niit.bej.springbootc5pc1.controller;

import com.niit.bej.springbootc5pc1.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
}
