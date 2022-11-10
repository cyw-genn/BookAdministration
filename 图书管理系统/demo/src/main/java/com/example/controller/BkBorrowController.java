package com.example.controller;

import com.example.entity.BkBorrow;
import com.example.service.BkBorrowService;
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
public class BkBorrowController {
    @Autowired
    private BkBorrowService bkBorrowService;

    @GetMapping("/bkborrow.html")
    public String userList(Map<String, List> result){
        List<BkBorrow> BkBorrows=bkBorrowService.findAll();
        result.put("bkBorrows",BkBorrows);
        return "bkborrow";
    }

    @PostMapping("/addBorrow")
    public String save(BkBorrow bkBorrow){
        bkBorrowService.save(bkBorrow);
        return "redirect:/bkborrow.html";
    }

    @RequestMapping("/delete/borrow/{readerNo}/{bookNo}/{borrowDate}")
    public String delete(@PathVariable String readerNo,@PathVariable String bookNo,@PathVariable String borrowDate, HttpServletResponse servletResponse) throws IOException {
        bkBorrowService.delete(readerNo,bookNo,borrowDate);
        System.out.println("delete successful");
        return "redirect:/bkborrow.html";
    }

    @GetMapping("/updatePage/borrow/{readerNo}/{bookNo}/{borrowDate}")
    public String updatePage(Model model, @PathVariable String readerNo,@PathVariable String bookNo,@PathVariable String borrowDate){
        BkBorrow bkBorrows=bkBorrowService.get(readerNo, bookNo, borrowDate);
        model.addAttribute("bkBorrows",bkBorrows);
        return "modifieBorrow";
    }

    @PutMapping("/updateBorrow")
    public String updateBorrow(Model model, BkBorrow bkBorrow, HttpServletRequest request){
        String readerNo=request.getParameter("readerNo");
        String bookNo=request.getParameter("bookNo");
        String borrowDate=request.getParameter("borrowDate");
        BkBorrow bkBorrowByBookNo=bkBorrowService.get(String.valueOf(readerNo),String.valueOf(bookNo),String.valueOf(borrowDate));
        bkBorrowService.update(bkBorrow);
        System.out.println(bkBorrow);
        return "redirect:/bkborrow.html";
    }
}
