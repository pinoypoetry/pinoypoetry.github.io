package xyz.jansengoyena.pinoypoetry.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Stanza {
    @Id
    @GeneratedValue
    long id;
    @OneToMany
    private List<Verse> verse;

    public Stanza() { }

    public Stanza(List<Verse> verse) {
        this.verse = verse;
    }

    public List<Verse> getVerse() {
        return verse;
    }

    public void setVerse(List<Verse> verse) {
        this.verse = verse;
    }
}
