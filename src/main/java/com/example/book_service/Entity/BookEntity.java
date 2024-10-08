package com.example.book_service.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BookEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookId;
    String bookName;

    
}
