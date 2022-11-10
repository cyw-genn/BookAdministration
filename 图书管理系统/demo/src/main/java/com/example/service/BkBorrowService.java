package com.example.service;

import com.example.entity.BkBorrow;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BkBorrowService {
    List<BkBorrow> findAll();
    int save(BkBorrow bkBorrow);
    Integer delete(String readerNo,String bookNo,String borrowDate);
    BkBorrow get(String readerNo,String bookNo,String borrowDate);
    int update(BkBorrow bkBorrow);
}
