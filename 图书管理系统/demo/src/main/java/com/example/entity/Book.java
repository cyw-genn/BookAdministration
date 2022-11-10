package com.example.entity;

public class Book {
    private String bookNo;
    private String bookName;
    private String author;
    private String publisher;
    private float price;
    private String bookClass;
    private String bookLoc;
    private String shopTime;

    public String getBookNo() {return bookNo;}
    public void setBookNo(String bookNo) {this.bookNo=bookNo;}
    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName=bookName;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author=author;}
    public String getPublisher() {return publisher;}
    public void setPublisher(String publisher) {this.publisher=publisher;}
    public float getPrice() {return price;}
    public void setPrice(float price) {this.price=price;}
    public String getBookClass() {return bookClass;}
    public void setBookClass(String bookClass) {this.bookClass=bookClass;}
    public String getBookLoc() {return bookLoc;}
    public void setBookLoc(String bookLoc) {this.bookLoc=bookLoc;}
    public String getShopTime() {return shopTime;}
    public void setShopTime(String shopTime) {this.shopTime=shopTime;}

    public Book(String bookNo,String bookName,String author,String publisher,float price,String bookClass,String bookLoc,String shopTime){
        this.bookNo=bookNo;
        this.bookName=bookName;
        this.author=author;
        this.publisher=publisher;
        this.price=price;
        this.bookClass=bookClass;
        this.bookLoc=bookLoc;
        this.shopTime=shopTime;
    }
    public Book(){

    }
}
