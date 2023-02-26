package com.niit.bej.springbootc5pc1.repositry;

import com.niit.bej.springbootc5pc1.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
