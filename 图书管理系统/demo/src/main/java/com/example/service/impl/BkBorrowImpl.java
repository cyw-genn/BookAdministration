package com.example.service.impl;

import com.example.entity.BkBorrow;
import com.example.mapper.BkBorrowMapper;
import com.example.service.BkBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BkBorrowImpl implements BkBorrowService {
    @Autowired
    private BkBorrowMapper bkBorrowMapper;

    @Override
    public List<BkBorrow> findAll(){return bkBorrowMapper.findAll();}

    @Override
    public int save(BkBorrow bkBorrow){
        return bkBorrowMapper.save(bkBorrow);
    }

    @Override
    public Integer delete(String readerNo,String bookNo,String borrowDate){
        return bkBorrowMapper.delete(readerNo,bookNo,borrowDate);
    }

    @Override
    public BkBorrow get(String readerNo,String bookNo,String borrowDate){
        return bkBorrowMapper.get(readerNo,bookNo,borrowDate);
    }

    @Override
    public int update(BkBorrow bkBorrow){
        return bkBorrowMapper.update(bkBorrow);
    }
}
