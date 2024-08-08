package com.warhe8d.controller;

import com.warhe8d.records.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @QueryMapping
    public List<Book> books(){
        return Book.books;
    }

    @QueryMapping
    public Optional<Book> getBookById(@Argument Integer id){
        return Book.getBookById(id);
    }
}
