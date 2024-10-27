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

    public List<Book> calculateDiscountedPrice(List<Book> books, String genre, double discount) {
        return null;
    }
}
