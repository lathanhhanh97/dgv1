package com.thanhhanh.dgv.repository;

import com.thanhhanh.dgv.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
