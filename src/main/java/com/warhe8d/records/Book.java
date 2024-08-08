package com.warhe8d.records;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id,
                   String name,
                   String genre,
                   Integer pageCount) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Oregairu", "SOL",324),
            new Book(2, "Hyouka", "SOL",212),
            new Book(1, "86", "drama",435),
            new Book(1, "serial killer Lain", "horror",190),
            new Book(1, "Monogatari", "Mystery",789)
            );
}
