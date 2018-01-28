package be.kokw.restserver.repositories;

import be.kokw.entities.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepo extends JpaRepository<Reserve,Long>{
}
