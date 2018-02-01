package be.kokw.restserver.repositories;

import be.kokw.restserver.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface BookRepo extends JpaRepository<Books,Long>{
    @Transactional
    List<Books> findBooksByTopicsContains(String topic);

    @Transactional
    Books findBooksByTitle(String title);

    @Transactional
    List<Books> findBooksByAuthorsContains(String author);
}
