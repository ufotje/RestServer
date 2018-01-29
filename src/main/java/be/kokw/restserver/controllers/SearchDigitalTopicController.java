package be.kokw.restserver.controllers;

import be.kokw.restserver.entities.Digital;
import be.kokw.restserver.repositories.DigitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchDigitalTopicController {
    private DigitalRepo repo;

    @Autowired
    private void setRepo(DigitalRepo repo) {
        this.repo = repo;
    }

    @GetMapping( value = "/search{topic}")
    public ResponseEntity<List<Digital>> handleDigitalByTopic(@PathVariable("topic") String topic) {

        return new ResponseEntity<>( repo.findDigitalsByTopicsContains(topic),HttpStatus.OK);

    }
}
