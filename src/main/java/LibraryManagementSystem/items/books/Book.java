package LibraryManagementSystem.items.books;

import LibraryManagementSystem.BorrowRequest;
import LibraryManagementSystem.enums.BorrowRequestStatus;
import LibraryManagementSystem.items.Borrowable;
import LibraryManagementSystem.items.LibraryItem;
import LibraryManagementSystem.users.Borrower;

import java.util.Date;
import java.util.Objects;

public abstract class Book extends LibraryItem implements Borrowable {

    protected String description;
    protected int numberOfPages;
    protected String publisher;
    protected double rating;

    protected Date returnDate;

    public Book(String title, String author, Date pubDate) {
        super(title, pubDate);
        this.author  = author;
        this.isAvailable = true;
        this.returnDate = null;
    }

    @Override
    public BorrowRequest initiateBorrowRequest(Borrower borrower) {
        if (this.isAvailable) {
            BorrowRequest newRequest =  new BorrowRequest(borrower, this);
            newRequest.setStatus(BorrowRequestStatus.PENDING_APPROVAL);
            return newRequest;
        } else {
            System.out.println("Book not available for borrowing");
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Book book = (Book) obj;
        return  Double.compare(book.rating, rating) == 0 &&
                Objects.equals(description, book.description) &&
                Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description, numberOfPages, publisher, rating);
    }

    public void returnItem(BorrowRequest borrowRequest) {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
