package library;

import java.util.List;
import java.util.ArrayList;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

/**
 * Module 3.3, Task 2
 */
public class Main {
    public static void main(String[] args) {
        // test members, books and library initialization
        List<LibraryMember> members = new ArrayList<>();
        members.add(new LibraryMember("Alice"));
        members.add(new LibraryMember("John"));

        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell", "1234567890"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
        books.add(new Book("Java Programming", "James Gosling", "1122334455"));

        Library library = new Library(books, members);

        // addBook()
        library.addBook(new Book("Git basics", "Linus Torvalds", "6677889900"));

        // addMember()
        LibraryMember newMember = new LibraryMember("Bob");
        library.addMember(newMember);

        // getBook()
        System.out.println();
        System.out.println("Retrieving book '1984'...");
        Book testBook = library.getBook("1984");

        // borrowBook()
        System.out.println();
        System.out.println("Borrowing book '1984' for member: " + newMember.getName());
        library.borrowBook(newMember, testBook);

        // returnBook()
        System.out.println();
        System.out.println("Returning book '1984' from member: " + newMember.getName());
        library.returnBook(newMember, testBook);

        // listMembers()
        System.out.println();
        library.listMembers();

        // listBooks()
        System.out.println();
        library.listBooks();

        // reserveBook()
        System.out.println();
        System.out.println("Reserving book 'Git basics' for member: " + newMember.getName());
        library.reserveBook(newMember, library.getBook("Git basics"));

        // displayReservedBooks()
        System.out.println();
        System.out.println("Displaying reserved books for member: " + newMember.getName());
        library.displayReservedBooks(newMember);

        // cancelReservation()
        System.out.println();
        System.out.println("Cancelling reservation of book 'Git basics' for member: " + newMember.getName());
        library.cancelReservation(newMember, library.getBook("Git basics"));
    }
}
