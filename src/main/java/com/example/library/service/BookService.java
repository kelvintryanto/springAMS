// BookService.java
package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Metode untuk menyimpan buku ke database
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Metode untuk mendapatkan semua buku dari database
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Metode untuk mencari buku berdasarkan penulis menggunakan Native SQL Query
    public List<Book> findBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    // Metode lain sesuai kebutuhan bisnis Anda
}
