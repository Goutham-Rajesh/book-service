package com.example.book_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book_service.Entity.BookEntity;
import com.example.book_service.Repository.BookRepository;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book")
    public List<BookEntity> getAllBooks(BookEntity bookEntity){
        return bookRepository.findAll();
    }

    @GetMapping("/book/{id}")
    public BookEntity getBookById(@PathVariable int id){
        return bookRepository.findById(id).orElse(null);
    }

    @PostMapping("/book")
    public BookEntity addBook(@RequestBody BookEntity bookEntity){
        return bookRepository.saveAndFlush(bookEntity);
    }

    //hi
    @DeleteMapping("/book/{id}")
    public void deleteById(@PathVariable int id){
        bookRepository.deleteById(id);
    }
    

}
