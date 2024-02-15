import main.Admin
import main.Book
import main.Database
import main.Member
import main.User

public class LibraryManagementSystem {

  private static final List<Book> bookList=new ArrayList<>();

  public static void main(String[] args) {

    Database.connect();


    Admin admin = new Admin();
    admin.addBook(new Book("1","Roberry","Robert kiyosaki","genri",true));
    admin.addMember(new Member("001", "Alice", "alice@example.com",bookList));

    User user = new User();
    List<Book> availableBooks = user.browseBooks();
    System.out.println("Available Books:");
    for (Book book : availableBooks) {
      System.out.println(book.getTitle());
    }


    user.issueBook("101", "001");

    user.returnBook("101", "001");


    Database.disconnect();
  }
}


