package com.BookstoreApi.BookStoreApi.repository;

import com.BookstoreApi.BookStoreApi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Additional query methods (if any) can be added here
}
