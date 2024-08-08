package com.warhe8d.records;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {
    public static List<Author> authors = Arrays.asList(
            new Author(1,"Wataru Watari"),
            new Author(2,"Honobu Yonezawa"),
            new Author(3,"Asakura Toru"),
            new Author(4,"ABe, Yoshitoshi"),
            new Author(5,"NISIO, ISIN")
    );

    public static Optional<Author> authorById(Integer authid){
        return authors.stream()
                .filter(a-> a.id.equals(authid))
                .findFirst();
    }
}
