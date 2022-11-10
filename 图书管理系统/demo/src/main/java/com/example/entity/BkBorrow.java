package com.example.entity;

public class BkBorrow {
    private String readerNo;
    private String bookNo;
    private String borrowDate;
    private Integer borrowTime;
    private String returnDate;

    public String getReaderNo() {return readerNo;}
    public void setReaderNo(String readerNo) {this.readerNo=readerNo;}
    public String getBookNo() {return bookNo;}
    public void setBookNo(String bookNo) {this.bookNo=bookNo;}
    public String getBorrowDate() {return borrowDate;}
    public void setBorrowDate(String borrowDate) {this.borrowDate=borrowDate;}
    public Integer getBorrowTime() {return borrowTime;}
    public void setBorrowTime(Integer borrowTime) {this.borrowTime=borrowTime;}
    public String getReturnDate() {return returnDate;}
    public void setReturnDate(String returnDate) {this.returnDate=returnDate;}

    public BkBorrow(String readerNo,String bookNo,String borrowDate,Integer borrowTime,String returnDate) {
        this.readerNo=readerNo;
        this.bookNo=bookNo;
        this.borrowDate=borrowDate;
        this.borrowTime=borrowTime;
        this.returnDate=returnDate;
    }
    public BkBorrow(){

    }
}
