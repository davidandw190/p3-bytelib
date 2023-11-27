package LibraryManagementSystem.items;

import LibraryManagementSystem.BorrowRequest;
import LibraryManagementSystem.users.Borrower;


public interface Borrowable {
    BorrowRequest initiateBorrowRequest(Borrower borrower);
    void setStatusBorrowed();
    void setStatusAvailable();
    boolean isAvailable();
}
