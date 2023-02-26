package com.niit.bej.springbootc5pc1.service;

import com.niit.bej.springbootc5pc1.domain.Movie;
import com.niit.bej.springbootc5pc1.repositry.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        return null;
    }

    @Override
    public boolean addMovie(Movie movie) {
        return false;
    }

    @Override
    public boolean updateMovie(int movieId, Movie movie) {
        return false;
    }

    @Override
    public Movie deleteMovieById(int movieId) {
        return null;
    }
}
