package main;




import java.util.List;

public class User {
    public List<Book> browseBooks() {

        return Database.getAvailableBooks();
    }

    public void issueBook(String bookId, String memberId) {

        Database.issueBook(bookId, memberId);
    }

    public void returnBook(String bookId, String memberId) {

        Database.returnBook(bookId, memberId);
    }


}

