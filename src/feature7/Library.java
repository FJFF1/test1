package feature7;

import java.util.*;

public class Library {
    private ArrayList <Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }


    public void addBook (Book book) {
        books.add(book);
    }

    public void removeBook (Book book) {
        books.remove(book);
    }


    public ArrayList<Book> displayBooks() {
        return books;
    }


}

