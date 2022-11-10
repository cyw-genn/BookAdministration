package com.example.mapper;

import com.example.entity.BkBorrow;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface BkBorrowMapper {
    @Select("select * from bkborrow")
    List<BkBorrow> findAll();

    @Insert("insert into bkborrow (readerNo,bookNo,borrowDate,borrowTime,returnDate) values(#{readerNo},#{bookNo},#{borrowDate},#{borrowTime},#{returnDate})")
    public int save(BkBorrow bkBorrow);

    @Delete("delete from bkborrow where readerNo=#{readerNo} and bookNo=#{bookNo} and borrowDate=#{borrowDate}")
    public int delete(String readerNo,String bookNo,String borrowDate);

    @Select("select * from bkborrow where readerNo=#{readerNo} and bookNo=#{bookNo} and borrowDate=#{borrowDate}")
    public BkBorrow get(String readerNo,String bookNo,String borrowDate);

    @Update("update bkborrow set borrowTime=#{borrowTime},returnDate=#{returnDate} where readerNo=#{readerNo} and bookNo=#{bookNo} and borrowDate=#{borrowDate}")
    public int update(BkBorrow bkBorrow);
}
