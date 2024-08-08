package com.warhe8d.controller;

import com.warhe8d.records.Author;
import com.warhe8d.records.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {
    @QueryMapping
    public List<Book> books(){
        return Book.books;
    }

    @QueryMapping
    public Optional<Book> getBookById(@Argument Integer id){
        return Book.getBookById(id);
    }
    @SchemaMapping
    public Optional<Author> author(Book book){
        return Author.authorById(book.authorId());
    }
}
