package be.kokw.restserver.controllers;

import be.kokw.restserver.entities.Books;
import be.kokw.restserver.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchBookAllController {
    private BookRepo repo;

    @Autowired
    private void setRepo(BookRepo repo){
        this.repo = repo;
    }

    @GetMapping( value = "/books/search/all")
    public ResponseEntity<List<Books>> handleBooksByAuthor() {
        List<Books> books = repo.findAll();
        if(books.isEmpty()){
            System.out.println("Lijst leeg!");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        System.out.println(books.get(0));
        return new ResponseEntity<>( books, HttpStatus.OK);
    }
}
