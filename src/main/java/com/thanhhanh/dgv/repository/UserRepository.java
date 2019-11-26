package com.thanhhanh.dgv.repository;

import com.thanhhanh.dgv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM users WHERE user_id = ?1", nativeQuery = true)
    User findUserById(Integer user_id);
}
