package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private static Map<Book, Member> bookMemberMap=new HashMap<>();
    private static List<Book> bookList=new ArrayList<>();
    private static List<Member> memberList=new ArrayList<>();

    public static void connect() {
        // Connect to the database
    }

    public static void disconnect() {
        // Disconnect from the database
    }

    public static void addBook(Book book) {
       if (!bookList.contains(book)){
           bookList.add(book);
       }
        System.out.println("this book added in early times ");
    }

    public static void addMember(Member member) {
        if (!memberList.contains(member)){
            memberList.add(member);
        }
        System.out.println("this member already added in early times ");
    }

    public static List<Book> getAvailableBooks() {

        return bookList;
    }

    public static void issueBook(String bookId, String memberId) {
        for (Book book : bookList) {
            for (Member member : memberList) {
                if (book.getBookId().equals(bookId) && member.getMemberId().equals(memberId)){
                    bookMemberMap.put(book,member);

                }
            }
        }
    }

    public static void returnBook(String bookId, String memberId) {
        for (Book book : bookList) {
            for (Member member : memberList) {
                if (book.getBookId().equals(bookId) && member.getMemberId().equals(memberId)){
                    bookMemberMap.put(book,member);

                }
            }
        }
    }


}