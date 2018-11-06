package xyz.jansengoyena.pinoypoetry.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue
    long id;


    private String name;
    @Column(length = 500)
    private String authorBiographyLink;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "authors")
    @JsonIgnore
    List<Poem> poems;

    public Author(){}

    public Author(String name, String authorBiographyLink) {

        this.name= name;
        this.authorBiographyLink = authorBiographyLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorBiographyLink() {
        return authorBiographyLink;
    }

    public void setAuthorBiographyLink(String authorBiographyLink) {
        this.authorBiographyLink = authorBiographyLink;
    }
}
