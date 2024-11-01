package com.learning.hackathon.practice;

public class Book {

    private Integer bookId;
    private String title;
    private String genre;
    private double price;
    private Author author;

    public Book(Integer bookId, String title, String genre, double price, Author author) {
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
