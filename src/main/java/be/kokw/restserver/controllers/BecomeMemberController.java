package be.kokw.restserver.controllers;

import be.kokw.restserver.entities.Member;
import be.kokw.restserver.repositories.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class BecomeMemberController {
    private MemberRepo repo;

    @Autowired
    private void setRepo(MemberRepo repo){
        this.repo = repo;
    }

    @PostMapping("members/register{m}")
    public ResponseEntity<Object> createMember(@PathVariable("m") Member m) {
        Member member = repo.save(m);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(member.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
