package com.company;

public class ZhambylBooks {
    private int id; // уникальный номер
    private String typeBook; // тип
    private String bookName; // название
    private double price; // цена


    public ZhambylBooks(int id, String typeBook, String bookName, double price) {
        this.id = id;
        this.typeBook = typeBook;
        this.bookName = bookName;
        this.price = price;

    }

    // get әдісі сыныптан белгілі бір айнымалы мәнді алу немесе алу үшін пайдаланылады .
    // "get" - получать,"set" - устанавливать

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String run(){
        return getBookName();
    }

}
