package main;


public class Admin {
    public void addBook(Book book) {

        Database.addBook(book);
    }

    public void addMember(Member member) {

        Database.addMember(member);
    }

    // Other admin functionalities
}