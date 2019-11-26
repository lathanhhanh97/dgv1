package com.thanhhanh.dgv.repository;

import com.thanhhanh.dgv.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    @Query(value = "SELECT * FROM movies WHERE movie_id = ?1", nativeQuery = true)
    Movie findMovieById(Integer movie_id);
}
