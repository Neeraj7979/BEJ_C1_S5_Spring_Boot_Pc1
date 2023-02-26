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
}
