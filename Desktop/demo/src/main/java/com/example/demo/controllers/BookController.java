package com.example.demo.controllers;

import com.example.demo.domain.Book;
import com.example.demo.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());
         return "books/list";
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public String createProduct(@RequestBody Book book) {

        bookRepository.save(book);
        return "redirect:/books";

    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable("id") Long id, @RequestBody Book book) {

        Book newBook = bookRepository.findById(id).get();
        newBook.setTitle(book.getTitle());
        bookRepository.save(newBook);
        return "redirect:/books";
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        bookRepository.deleteById(id);
         return "redirect:/books";
    }

}
