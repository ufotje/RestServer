package be.kokw.restserver.repositories;

import be.kokw.restserver.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Book,Long>{
}
