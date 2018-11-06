package xyz.jansengoyena.pinoypoetry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.jansengoyena.pinoypoetry.model.Author;
import xyz.jansengoyena.pinoypoetry.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author getAuthor(long id) {
        return authorRepository.findOne(id);
    }

    @Override
    public Author getAuthor(String name) {
        return authorRepository.findByName(name);
    }
}
