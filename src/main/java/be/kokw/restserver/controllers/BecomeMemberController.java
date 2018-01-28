package be.kokw.restserver.controllers;

import be.kokw.restserver.entities.Member;
import be.kokw.restserver.repositories.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/members")
public class BecomeMemberController {
    @Autowired
    MemberRepo repo;

    @PostMapping("/register")
    public ResponseEntity<Object> createMember(@RequestBody Member m) {
        Member member = repo.save(m);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(member.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
