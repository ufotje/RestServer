package be.kokw.restserver.controllers;

import be.kokw.restserver.entities.Book;
import be.kokw.restserver.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchBookTopicController {
    private BookRepo repo;

    @Autowired
    private void setRepo(BookRepo repo){
        this.repo = repo;
    }

    @GetMapping( value = "/books/search{topic}")
    public ResponseEntity<List<Book>> handleBooksByTopic(@PathVariable("topic") String topic) {

        return new ResponseEntity<>( repo.findBooksByTopicContains(topic),HttpStatus.OK);

    }
}
