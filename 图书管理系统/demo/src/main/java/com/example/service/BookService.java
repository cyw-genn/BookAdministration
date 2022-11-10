package com.example.service;

import com.example.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    List<Book> findAll();
    int save(Book book);
    Integer delete(String bookNo);
    Book get(String bookNo);
    int update(Book book);
}
