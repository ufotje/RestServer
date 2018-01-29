package be.kokw.restserver.repositories;

import be.kokw.restserver.entities.Digital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface DigitalRepo extends JpaRepository<Digital,Integer> {

    @Transactional
    Digital findDigitalByTitle(String title);

    @Transactional
    List<Digital> findDigitalsByTopicsContains(String topic);

    @Transactional
    List<Digital> findDigitalsByAuthorsContains(String author);
}
