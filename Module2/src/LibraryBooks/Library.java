package LibraryBooks;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        int idx = 1;
        for (Book book : books) {
            System.out.println(idx + ". " + book.getAllInfo());
            idx++;
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getAllInfo());
            }
        }
    }

    public static void main(String[] args) {
        Library books = new Library();

        books.addBook(new Book("Introduction to Java Programming", "John Smith", 2020));
        books.addBook(new Book("Data Structures and Algorithms", "Jane Doe", 2018));
        books.addBook(new Book("The Art of Fiction", "Alice Johnson", 2019));

        System.out.println("Library catalog:");
        books.displayBooks();

        System.out.println("\nBooks by author \"Jane Doe\"");
        books.findBooksByAuthor("Jane Doe");
    }
}
