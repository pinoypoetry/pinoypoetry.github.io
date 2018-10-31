package xyz.jansengoyena.pinoypoetry.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Poem {

    @Id
    @GeneratedValue
    long id;

    @Column(length = 300)
    private String title;

    public Poem() { }

    public Poem(String title, List<Author> authors, List<Stanza> stanzaList) {
        this.title = title;
        this.authors = authors;
        this.stanzaList = stanzaList;
    }


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "poems_authors",
            joinColumns = { @JoinColumn(name = "poem_id") },
            inverseJoinColumns = { @JoinColumn(name = "auhtor_id") })
    private List<Author> authors;


    @OneToMany
    private List<Stanza> stanzaList;

}
