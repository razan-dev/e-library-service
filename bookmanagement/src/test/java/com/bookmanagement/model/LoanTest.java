package com.bookmanagement.model;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {
    @Test
    void testLoan() {
        Loan loan = new Loan();
        loan.setId(123790L);


        loan.setLoanDate("2024-06-08");
        loan.setReturnDate("2024-07-08");

        Book book = new Book();
        book.setId(10L);
        book.setTitle("The developer");
        book.setAuthor("John Doe");
        loan.setBook(book);

        User user = new User();
        user.setUsername("Razan");
        loan.setUser(user);


        assertEquals("2024-06-08",loan.getLoanDate());
        assertEquals("2024-07-08",loan.getReturnDate());
        assertEquals(123790L,loan.getId());
        assertEquals("The developer",loan.getBook().getTitle());
        assertEquals("John Doe",loan.getBook().getAuthor());
        assertEquals(10L,loan.getBook().getId());
        assertEquals("Razan",user.getUsername());

    }
}