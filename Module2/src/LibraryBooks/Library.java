package LibraryBooks;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        if (!this.books.contains(book))
            this.books.add(book);
    }

    public Book getBookByTitle(String title) {
        for (Book book : this.books)
            if (book.getTitle().equals(title)) return book;
        return null;
    }

    public void addUser(User user) {
        if (!this.users.contains(user))
            this.users.add(user);
    }

    public void displayBooks() {
        System.out.println("Library catalog:");
        int idx = 1;
        for (Book book : this.books) {
            System.out.println(" " + idx + ". " + book.getAllInfo());
            idx++;
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : this.books) {
            if (book.getAuthor().equals(author))
                System.out.println(book.getAllInfo());
        }
    }

    public void borrowBook(User user, String title) {
        Book book = getBookByTitle(title);
        user.addBorrowedBook(book);
        this.books.remove(book);
    }

    public void returnBook(User user, Book book) {
        user.removeBorrowedBook(book);
        this.addBook(book);
    }

    public boolean isBookAvailable(String title) {
        return this.books.stream().anyMatch(book -> book.getTitle().equals(title));
    }

    public double getAverageBookRating() {
        double ratingSum = 0.0;
        for (Book book : this.books)
            ratingSum += book.getRating();
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
}
