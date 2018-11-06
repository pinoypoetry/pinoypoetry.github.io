package xyz.jansengoyena.pinoypoetry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.jansengoyena.pinoypoetry.model.Author;
import xyz.jansengoyena.pinoypoetry.service.AuthorService;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/api/1.0/author/{name}")
    public Author getAuthor(@PathVariable String name){
        return authorService.getAuthor(name);
    }

}
