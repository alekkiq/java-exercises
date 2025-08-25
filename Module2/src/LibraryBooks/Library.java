package LibraryBooks;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void displayBooks() {
        int idx = 1;
        for (Book book : this.books) {
            System.out.println(idx + ". " + book.getAllInfo());
            idx++;
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : this.books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getAllInfo());
            }
        }
    }

    public void borrowBook(User user, String title) {
        this.books.removeIf(book -> book.getTitle().equals(title));
    }

    public void returnBook(User user, Book book) {
        this.addBook(book);
    }

    public boolean isBookAvailable(String title) {
        return this.books.stream().anyMatch(book -> book.getTitle().equals(title));
    }

    public double getAverageBookRating() {
        double ratingSum = 0.0;
        for (Book book : this.books) {
            ratingSum += book.getRating();
        }
        return (ratingSum / this.books.size());
    }

    public Book getMostReviewedBook() {
        Book mostReviewed = this.books.get(0);

        for (Book book : this.books) {
            if (book.getReviewCount() > mostReviewed.getReviewCount())
                mostReviewed = book;
        }

        return mostReviewed;
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
