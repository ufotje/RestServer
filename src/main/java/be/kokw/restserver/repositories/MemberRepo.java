package be.kokw.restserver.repositories;

import be.kokw.restserver.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepo extends JpaRepository<Member,Long>{

    @Transactional
    Member findMemberByFirstNameAndLastName(String firstName, String lastName);
}
