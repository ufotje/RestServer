package be.kokw.restserver.controllers;

import be.kokw.restserver.entities.Books;
import be.kokw.restserver.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

@RestController
public class SearchBookAuthorController {
    private BookRepo repo;

    @Autowired
    private void setRepo(BookRepo repo) {
        this.repo = repo;
    }

    @GetMapping(value = "/books/search/author/{author}")
    public ResponseEntity<List<Books>> handleBooksByAuthor(@PathVariable("author") String author) {

        List<Books> books = repo.findBooksByAuthorsContains(author);
        if (books.isEmpty()) {
            System.out.println("Lijst leeg!");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        System.out.println(books.get(0));
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
