package com.example.service.impl;

import com.example.entity.Book;
import com.example.mapper.BookMapper;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findAll(){return bookMapper.findAll();}

    @Override
    public int save(Book book){
        return bookMapper.save(book);
    }

    @Override
    public Integer delete(String bookNo){
        return bookMapper.delete(bookNo);
    }

    @Override
    public Book get(String bookNo){
        return bookMapper.get(bookNo);
    }

    @Override
    public int update(Book book){
        return bookMapper.update(book);
    }
}
