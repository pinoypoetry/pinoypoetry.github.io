package xyz.jansengoyena.pinoypoetry.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue
    long id;

    private String firstName;
    private String lastName;
    @Column(length = 500)
    private String authorBiographyLink;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "authors")
    List<Poem> poems;

    public Author(){}

    public Author(String firstName, String lastName, String authorBiographyLink) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.authorBiographyLink = authorBiographyLink;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAuthorBiographyLink() {
        return authorBiographyLink;
    }

    public void setAuthorBiographyLink(String authorBiographyLink) {
        this.authorBiographyLink = authorBiographyLink;
    }
}
