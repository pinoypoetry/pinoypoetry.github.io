package xyz.jansengoyena.pinoypoetry.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.jansengoyena.pinoypoetry.model.Poem;

public interface PoemRepository extends CrudRepository<Poem,Long> {

}
