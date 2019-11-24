package com.thanhhanh.dgv.repository;

import com.thanhhanh.dgv.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    @Query(value = "SELECT * FROM cinemas WHERE cinema_id = ?1", nativeQuery = true)
    Cinema findCinemeById(Integer cinema_id);
}
