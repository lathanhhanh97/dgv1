package com.thanhhanh.dgv.repository;

import com.thanhhanh.dgv.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
