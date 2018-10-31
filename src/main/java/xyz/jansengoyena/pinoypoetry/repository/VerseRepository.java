package xyz.jansengoyena.pinoypoetry.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.jansengoyena.pinoypoetry.model.Verse;

public interface VerseRepository extends CrudRepository<Verse,Long> {
}
