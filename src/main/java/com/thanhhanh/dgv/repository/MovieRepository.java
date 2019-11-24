package com.thanhhanh.dgv.repository;

import com.thanhhanh.dgv.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query(value = "SELECT * FROM cinemas WHERE cinema_id = ?1", nativeQuery = true)
    Movie findMovieById(Integer cinema_id);
}
