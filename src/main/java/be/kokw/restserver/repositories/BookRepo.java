package be.kokw.restserver.repositories;

import be.kokw.restserver.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface BookRepo extends JpaRepository<Book,Long>{
    @Transactional
    List<Book> findBooksByTopicContains(String topic);

    @Transactional
    Book findBooksByTitle(String title);

    @Transactional
    List<Book> findBooksByAuthorContains(String author);
}
