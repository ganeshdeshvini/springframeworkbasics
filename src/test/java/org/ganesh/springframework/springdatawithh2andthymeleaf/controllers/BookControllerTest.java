package org.ganesh.springframework.springdatawithh2andthymeleaf.controllers;

import org.ganesh.springframework.springdatawithh2andthymeleaf.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class BookControllerTest {
    @InjectMocks
    private BookController bookController;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private Model model;

    @Test
    void getBooks() {
        String attributeName = "books";
        String viewName = bookController.getBooks(model);
//        assertEquals(viewName);
    }
}