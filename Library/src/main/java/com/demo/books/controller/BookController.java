package com.demo.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.demo.books.data.entity.Book;
import com.demo.books.data.repository.BookRepository;
import java.util.List;

@RestController
public class BookController {

	@Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> getAllNotes() {
        return bookRepository.findAll();
    }

    @PostMapping("/books")
    public Book createNote(Book book) {
        return bookRepository.save(book);
    }


}
