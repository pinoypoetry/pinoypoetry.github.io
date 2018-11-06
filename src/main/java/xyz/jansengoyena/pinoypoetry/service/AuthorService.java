package xyz.jansengoyena.pinoypoetry.service;

import xyz.jansengoyena.pinoypoetry.model.Author;

public interface AuthorService  {
    Author getAuthor(long id);
    Author getAuthor(String name);
}
