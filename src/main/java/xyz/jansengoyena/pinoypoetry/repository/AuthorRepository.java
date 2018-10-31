package xyz.jansengoyena.pinoypoetry.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.jansengoyena.pinoypoetry.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
