package com.example.controller;

import com.example.entity.Authority;
import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book.html")
    public String userList(Map<String, List> result){
        List<Book> Books=bookService.findAll();
        result.put("books",Books);
        return "book";
    }

    @PostMapping("/addBook")
    public String save(Book book){
        bookService.save(book);
        return "redirect:/book.html";
    }

    @RequestMapping("/delete/book/{bookNo}")
    public String delete(@PathVariable String bookNo, HttpServletResponse servletResponse) throws IOException {
        bookService.delete(bookNo);
        System.out.println("delete successful");
        return "redirect:/book.html";
    }

    @GetMapping("/updatePage/book/{bookNo}")
    public String updatePage(Model model, @PathVariable String bookNo){
        Book books=bookService.get(bookNo);
        model.addAttribute("books",books);
        return "modifieBook";
    }

    @PutMapping("/updateBook")
    public String updateBook(Model model, Book book, HttpServletRequest request){
        String bookNo=request.getParameter("bookNo");
        Book bookByBookNo=bookService.get(String.valueOf(bookNo));
        bookService.update(book);
        System.out.println(book);
        return "redirect:/book.html";
    }
}
