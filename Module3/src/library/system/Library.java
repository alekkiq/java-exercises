package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library(List<Book> books, List<LibraryMember> members) {
        this.books = books;
        this.members = members;
    }

    public void addBook(Book book) {
        if (!this.books.contains(book)) {
            this.books.add(book);
        }
    }

    public Book getBook(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equals(title))
                return book;
        }
        System.out.println("Book not found: " + title);
        return null;
    }

    public void addMember(LibraryMember member) {
        if (!this.members.contains(member)) {
            this.members.add(member);
        }
    }

    public void listMembers() {
        System.out.println("Library Members:");
        for (LibraryMember member : this.members) {
            System.out.println(" " + member.getName() + " (member id: " + member.getMemberId() + ")");
        }
    }

    public void listBooks() {
        System.out.println("Available Library Books:");
        for (Book book : this.books) {
            System.out.println(" " + book.getTitle() + " by " + book.getAuthor());
        }
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (this.books.contains(book) && this.members.contains(member)) {
            member.getBorrowedBooks().add(book);
            this.books.remove(book);
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (this.members.contains(member) && member.getBorrowedBooks().contains(book)) {
            member.getBorrowedBooks().remove(book);
            this.books.add(book);
        }
    }
}
