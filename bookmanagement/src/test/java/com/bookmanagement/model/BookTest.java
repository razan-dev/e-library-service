package com.bookmanagement.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void createANewBookTest() {
       Book book = new Book();
       book.setTitle("Book Title");
       book.setId(1L);
       book.setAuthor("Author");

       assertEquals("Book Title", book.getTitle());
       assertEquals(1L, book.getId());
       assertEquals("Author", book.getAuthor());

    }
}