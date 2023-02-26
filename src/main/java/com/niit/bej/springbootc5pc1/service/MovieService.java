package com.niit.bej.springbootc5pc1.service;

import com.niit.bej.springbootc5pc1.domain.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();

    Movie addMovie(Movie movie);

    boolean updateMovie(int movieId, Movie movie) throws Exception;

    void deleteMovieById(int movieId);
}
