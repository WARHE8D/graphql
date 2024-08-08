package com.warhe8d.records;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   String genre,
                   Integer pageCount,
                   Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Oregairu", "SOL",324,1),
            new Book(2, "Hyouka", "SOL",212,2),
            new Book(3, "86", "drama",435,3),
            new Book(4, "serial killer Lain", "horror",190,4),
            new Book(5, "Monogatari", "Mystery",789,5)
            );

    public static Optional<Book> getBookById(Integer id){
        return  books.stream()
                .filter(b-> b.id.equals(id))
                .findFirst();
    }
}
