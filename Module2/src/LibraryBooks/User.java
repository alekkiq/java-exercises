package LibraryBooks;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String[] getBorrowedBooks() {
        String[] books = new String[this.borrowedBooks.size()];
        int idx = 0;
        for (Book book : this.borrowedBooks) {
            books[idx] = book.getTitle();
            idx++;
        }

        return books;
    }
}
