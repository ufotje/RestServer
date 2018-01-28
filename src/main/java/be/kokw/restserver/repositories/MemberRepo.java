package be.kokw.restserver.repositories;

import be.kokw.restserver.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member,Long>{
}
