package com.example.mapper;

import com.example.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();

    @Insert("insert into book (bookNo,bookName,author,publisher,price,bookClass,bookLoc,shopTime) values(#{bookNo},#{bookName},#{author},#{publisher},#{price},#{bookClass},#{bookLoc},#{shopTime})")
    public int save(Book book);

    @Delete("delete from book where bookNo=#{bookNo}")
    public int delete(String bookNo);

    @Select("select * from book where bookNo=#{bookNo}")
    public Book get(String bookNo);

    @Update("update book set bookName=#{bookName},author=#{author},publisher=#{publisher},price=#{price},bookClass=#{bookClass},bookLoc=#{bookLoc},shopTime=#{shopTime} where bookNo=#{bookNo}")
    public int update(Book book);
}
