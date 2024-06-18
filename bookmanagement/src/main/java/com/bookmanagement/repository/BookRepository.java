package com.bookmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookmanagement.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
