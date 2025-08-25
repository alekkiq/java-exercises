package LibraryBooks;

public class LibraryDriver {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        Book testBook = new Book("The Art of Fiction", "Alice Johnson", 2019, 8.8);
        library.addBook(testBook);

        // Add a review to testBook
        testBook.addReview("A modern masterpiece!");
        library.addBook(new Book("Introduction to Java Programming", "John Smith", 2020, 4.0));
        library.addBook(new Book("Data Structures and Algorithms", "Jane Doe", 2018, 1.2));

        // Add users
        User testUser = new User("Aleksi", 20);
        library.addUser(testUser);
        library.addUser(new User("Janne", 35));
        library.addUser(new User("Pekka", 52));

        // Method tests

        // displayBooks()
        library.displayBooks();

        // findBooksByAuthor()
        System.out.println("\nBooks by author \"Jane Doe\"");
        library.findBooksByAuthor("Jane Doe");

        // borrowBook()
        System.out.println("\nAleksi is borrowing \"The Art of Fiction\"...");
        library.borrowBook(testUser, "The Art of Fiction");

        // displayBooks() - after borrowBook()
        System.out.println();
        library.displayBooks();

        // isBookAvailable()
        System.out.println("\nIs \"The Art of Fiction\" available? " + library.isBookAvailable("The Art of Fiction"));

        // returnBook()
        System.out.println("\nAleksi returns \"The Art of Fiction\"...");
        library.returnBook(testUser, testBook);

        // displayBooks() - after returnBook()
        System.out.println();
        library.displayBooks();

        // getAverageBookRating()
        System.out.printf("\nAverage rating of the library's books: %.2f", library.getAverageBookRating());
        System.out.println();

        // getMostReviewedBook()
        System.out.println("\nThe book with the most reviews: " + library.getMostReviewedBook().getTitle());
    }
}
