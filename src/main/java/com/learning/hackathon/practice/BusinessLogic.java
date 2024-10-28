package com.learning.hackathon.practice;

import java.util.List;
import java.util.stream.Collectors;

public class BusinessLogic {

    /**
     * It should find all the books belonging to the input genre and should
     * return the list of books matching the genre.
     *
     * If no matching genre is found, print an error message
     * "Genre is not available in the list"
     *
     * @param books
     * @param genre
     * @return
     */
    public List<Book> getBooksBelongingToAGenre(List<Book> books, String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    /**
     * It should find the books matching the genre and apply the discount to the book.
     * It should return list of books matching the genre after applying the discount.
     *
     * Discounted Price = Price - (Price * discount % )
     *
     * @param books
     * @param genre
     * @param discount
     * @return
     */
    public List<Book> calculateDiscountedPrice(List<Book> books, String genre, double discount) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .map(book -> {
                    double price = book.getPrice();
                    double discountedPrice = price - (price - discount * 1/100);
                    book.setPrice(discountedPrice);
                    return book;
                })
                .collect(Collectors.toList());
    }
}
