package be.kokw.restserver.repositories;

import be.kokw.restserver.entities.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepo extends JpaRepository<Reserve,Long>{

}
