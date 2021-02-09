package com.example.demo.controllers;

import com.example.demo.domain.Author;
import com.example.demo.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "authors/authorList";
    }

    @RequestMapping(value = "/authors", method = RequestMethod.POST)
    public String createProduct(@RequestBody Author author) {

        authorRepository.save(author);
        return "redirect:/authors";

    }

    @RequestMapping(value = "/authors/{id}", method = RequestMethod.PUT)
    public String updateAuthor(@PathVariable("id") Long id, @RequestBody Author author) {

        Author newAuthor = authorRepository.findById(id).get();

        if(author.getFirstName()!=null)
            newAuthor.setFirstName(author.getFirstName());
        if(author.getLastName()!=null)
            newAuthor.setLastName(author.getLastName());

        if (author.getBooks()!=null)
            newAuthor.setBooks(author.getBooks());

            authorRepository.save(newAuthor);
            return "redirect:/authors";
    }

    @RequestMapping(value = "/authors/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        authorRepository.deleteById(id);
        return "redirect:/authors";
    }
}
