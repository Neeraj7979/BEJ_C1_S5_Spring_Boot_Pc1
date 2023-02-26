package com.niit.bej.springbootc5pc1.controller;

import com.niit.bej.springbootc5pc1.domain.Movie;
import com.niit.bej.springbootc5pc1.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getMoviesList() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movies/add")
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) { // HTTP Status Code back to the client if the movie is created
        movieService.addMovie(movie);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/movies/edit/{movieID}")
    public ResponseEntity<?> updateMovie(@PathVariable int movieId, @RequestBody Movie updatedMovie) {
        try {
            movieService.updateMovie(movieId, updatedMovie);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/movies/delete/{movieID}")
    public ResponseEntity<?> deleteMovie(@PathVariable int movieID) {
        movieService.deleteMovieById(movieID);
        return ResponseEntity.ok().build();
    }


}
