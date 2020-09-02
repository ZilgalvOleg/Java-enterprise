package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Author[] authors = new Author[5];
        Book[] books = new Book[5];

        Author author = new Author();
        Book book = new Book();
        author.setAge(23);
        author.setName("Micha");
        author.addBook(book);
        book.setTitle("Life");
        book.setNumberOfPages(50);
        book.addAuthor(author);

        Author author1 = new Author();
        Book book1 = new Book();
        author1.setAge(50);
        author1.setName("Koly");
        author1.addBook(book1);
        book1.setTitle("Winnie-the-Pooh");
        book1.setNumberOfPages(333);
        book1.addAuthor(author1);

        Author author2 = new Author();
        Book book2 = new Book();
        author2.setAge(33);
        author2.setName("Oleg");
        author2.addBook(book2);
        book2.setTitle("Jeeves and Wooster stories");
        book2.setNumberOfPages(450);
        book2.addAuthor(author2);

        Author author3 = new Author();
        Book book3 = new Book();
        author3.setAge(37);
        author3.setName("Vasy");
        author3.addBook(book3);
        book3.setTitle("Harry Potter and the Philosopher's Stone");
        book3.setNumberOfPages(800);
        book3.addAuthor(author3);
        book3.addAuthor(author2);

        Author author4 = new Author();
        Book book4 = new Book();
        author4.setAge(22);
        author4.setName("Nataly");
        author4.addBook(book4);
        book4.setTitle("Airport");
        book4.setNumberOfPages(452);
        book4.addAuthor(author4);

        authors[0] = author;
        authors[1] = author1;
        authors[2] = author2;
        authors[3] = author3;
        authors[4] = author4;

        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        books[4] = book4;

        //for (int i = 0; i <= 4; i++) {
            //System.out.println(authors[i].getName() + " " + authors[i].getAge()
                    //+ " " + books[i].getTitle() + " " + books[i].getNumberOfPages());
        //}

        System.out.println("Книги в которых больше 200 страниц:");
        Arrays.stream(books)
                .filter(s -> s.getNumberOfPages() > 200)
                .forEach(s -> System.out.println("- " + s.getTitle() + " с колличеством страниц " + s.getNumberOfPages()));

        Comparator <Book> comparator = Comparator.comparingInt(Book::getNumberOfPages);
        Book min = Arrays.stream(books)
                .min(comparator)
                .get();
        System.out.println();
        System.out.println("Книга с минимальным колличеством старниц " + min.getTitle() + " в ней "
                + min.getNumberOfPages() + " страниц.");

        Book max = Arrays.stream(books)
                .max(comparator)
                .get();
        System.out.println("Книга с максимальным колличеством старниц " + max.getTitle() + " в ней "
                + max.getNumberOfPages() + " страниц.");

        System.out.println();
        System.out.println("Книги только с одним автором:");
        Arrays.stream(books)
                .filter(s -> s.getAuthors().size() == 1)
                .forEach(s -> System.out.println("- " + s.getTitle() + " у нее только один автор - "
                        + s.getAuthors().get(0).getName()));

        Arrays.stream(books)
                .sorted(Comparator.comparingInt(Book::getNumberOfPages)
                .forEach(System.out::println)

    }

}
