package library.model;

import java.util.List;
import java.util.ArrayList;

public class LibraryMember {
    private static int memberCount = 0;

    private String name;
    private int memberId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.memberId = ++memberCount;
        this.name = name;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public List<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}
