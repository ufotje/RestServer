package be.kokw.restserver.controllers;

import be.kokw.restserver.entities.Books;
import be.kokw.restserver.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SearchBookTitleController {
    private BookRepo repo;

    @Autowired
    private void setRepo(BookRepo repo){
        this.repo = repo;
    }

    @GetMapping( value = "/books/search/title/{title}")
    public ResponseEntity<List<Books>> handleBooksByTitle(@PathVariable("title") String title) {

        return new ResponseEntity<>( repo.findBooksByTitle(title), HttpStatus.OK);

    }
}
