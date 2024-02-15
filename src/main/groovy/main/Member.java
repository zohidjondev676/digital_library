package main;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Member {
    private String memberId;
    private String name;
    private String email;
    private List<Book> borrowedBooks;


                    }