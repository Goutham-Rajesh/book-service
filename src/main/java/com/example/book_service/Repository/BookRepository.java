package com.example.book_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.book_service.Entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer>{

    
} 
