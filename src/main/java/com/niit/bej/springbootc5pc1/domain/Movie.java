package com.niit.bej.springbootc5pc1.domain;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Movie {
    @Id
    private int movieID;
    private String movieName;
    private int yearOfRelease;
    private String genre;

    public Movie(int movieID, String movieName, int yearOfRelease, String genre) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public Movie() {
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
