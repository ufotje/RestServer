package be.kokw.restserver.controllers;

import be.kokw.restserver.entities.Books;
import be.kokw.restserver.entities.Member;
import be.kokw.restserver.entities.Reserve;
import be.kokw.restserver.repositories.BookRepo;
import be.kokw.restserver.repositories.MemberRepo;
import be.kokw.restserver.repositories.ReserveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ReserveBookController {
    private BookRepo bookRepo;
    private MemberRepo memberRepo;
    private ReserveRepo reserveRepo;

    @Autowired
    private void setBookRepo(BookRepo repo){
        bookRepo = repo;
    }

    @Autowired
    private void setMemberRepo(MemberRepo repo){
        memberRepo = repo;
    }

    @Autowired
    private void setReserveRepo(ReserveRepo repo){
        reserveRepo = repo;
    }

    @PostMapping("/book/{firstName}/{lastName}/{title}/{pickupDate}")
    public ResponseEntity<Reserve> handleReserveBookByMemberNameAndBookTitle(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName,
                                                                              @PathVariable("title") String title, @PathVariable("pickupDate") LocalDate pickupDate){
        List<Books> book = bookRepo.findBooksByTitle(title);
        Member member = memberRepo.findMemberByFirstNameAndLastName(firstName,lastName);
        Reserve reserved = new Reserve(book.get(0),member,pickupDate);
        HttpStatus status;
        if(reserved.getId() != 0){
            status = HttpStatus.OK;
            reserveRepo.save(reserved);
        } else{
            status = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(reserved, status);

    }
}
