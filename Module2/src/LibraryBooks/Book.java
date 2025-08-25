package LibraryBooks;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publishYear;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getAllInfo() {
        return "Title: \"" + this.getTitle() +
                "\", Author: \"" + this.getAuthor() +
                "\", Year: " + this.getPublishYear();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int year) {
        this.publishYear = year;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }

    public int getReviewCount() {
        return this.reviews.size();
    }
}
