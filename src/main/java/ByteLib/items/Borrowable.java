package ByteLib.items;

import ByteLib.BorrowRequest;
import ByteLib.users.Borrower;


public interface Borrowable {
    BorrowRequest initiateBorrowRequest(Borrower borrower);
    void setStatusBorrowed();
    void setStatusAvailable();
    boolean isAvailable();
}
