package xyz.jansengoyena.pinoypoetry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Verse {
    @Id
    @GeneratedValue
    long id;
    @Column(length = 1000)
    private String content;

    public Verse() {}

    public Verse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
