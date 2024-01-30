// BookRepository.java
package com.example.library.repository;

import com.example.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Native SQL Query untuk mencari buku berdasarkan penulis
    @Query(value = "SELECT * FROM Book b WHERE b.author = :author", nativeQuery = true)
    List<Book> findByAuthor(String author);
}
