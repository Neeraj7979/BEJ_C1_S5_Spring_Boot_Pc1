package com.niit.bej.springbootc5pc1.service;

import com.niit.bej.springbootc5pc1.domain.Movie;
import com.niit.bej.springbootc5pc1.repositry.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public boolean updateMovie(int movieId, Movie movie) throws Exception {
        Optional<Movie> movieFromDatabase = movieRepository.findById(movieId);
        if (movieFromDatabase.isPresent()) {
            Movie movie1 = movieFromDatabase.get();
            movie1.setMovieName(movie.getMovieName());
            movie.setGenre(movie.getGenre());
            movie.setYearOfRelease(movie.getYearOfRelease());
            movieRepository.save(movie);
        } else {
            throw new Exception("The movie with the ID " + movieId + " was not found in the database.");
        }
        return true;


    }

    @Override
    public void deleteMovieById(int movieId) {
        movieRepository.deleteById(movieId);
    }
}
