package com.learning.hackathon.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_02 {

    public static void main(String[] args) {

        /**
         * Note : Assume an author has written only one book.
         */

        /**
         * First, read the number of Author objects to be added to the array/list.
         * Next, read the attributes for each Author object in the mentioned sequence.
         * Read the attributes for each Book object.
         * Repeat steps 2 to 3 the number of Author objects given in the first line of input.
         * Next, read the parameters to be passed to the respective methods, ex. genre and discount.
         */

        Scanner scan = new Scanner(System.in);
        int numOfAuthors = scan.nextInt();

        List<Book> books = new ArrayList<>();

        for(int i=0; i<numOfAuthors; i++) {

            int authorId = scan.nextInt();
            scan.nextLine();
            String authorName = scan.nextLine();

            Author author = new Author(authorId, authorName);

            int bookId = scan.nextInt();
            scan.nextLine();
            String bookTitle = scan.nextLine();
            String genre = scan.nextLine();
            double price = scan.nextDouble();

            Book book = new Book(bookId, bookTitle, genre, price, author);
            books.add(book);
        }

        scan.nextLine();
        String genre = scan.nextLine();
        double discount = scan.nextDouble();

        List<Book> booksBelongingToAGenre = BusinessLogic.getBooksBelongingToAGenre(books, genre);
        if (!booksBelongingToAGenre.isEmpty()) {
            booksBelongingToAGenre.stream()
                    .forEach(book -> {
                        String authorName = book.getAuthor().getAuthorName();
                        System.out.println("AuthorName: " + authorName + ", Title: " + book.getTitle());
                    });
        }
        else
            System.out.println("Genre not available in the list.");

        System.out.println("\nDiscounted " + genre + " Books:");

        List<Book> booksWithDiscountPrice = BusinessLogic.calculateDiscountedPrice(books, genre, discount);
        if (!booksWithDiscountPrice.isEmpty()) {
            booksWithDiscountPrice.stream()
                    .forEach(book -> {
                        String authorName = book.getAuthor().getAuthorName();
                        String title = book.getTitle();
                        double discountedPrice = book.getPrice();

                        System.out.println("AuthorName: " + authorName + ", Title: " + title + ", UpdatedPrice: " + discountedPrice);
                    });
        }
        else
            System.out.println("Discounted books are unavailable in the given genre.");
    }
}
