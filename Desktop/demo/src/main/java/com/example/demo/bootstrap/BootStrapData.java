package com.example.demo.bootstrap;
import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.domain.Publisher;
import com.example.demo.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Publisher publisher= new Publisher();
        publisher.setName("SFG");
        publisher.setCity("Petersburg");
        publisher.setState("FL");

        Author author = new Author("Rodd","Johnson");
        Book book = new Book ("J2EE Development without EJB","343323");
        author.getBooks().add(book);
        book.getAuthors().add(author);



        authorRepository.save(author);
        bookRepository.save(book);

        Author newAuthor= new Author("Eric","Evans");
        Book newBook= new Book ("Domain Driven Design", "12223");
        newAuthor.getBooks().add(newBook);
        newBook.getAuthors().add(newAuthor);

        authorRepository.save(newAuthor);
        bookRepository.save(newBook);


        publisherRepository.save(publisher);

        newBook.setPublisher(publisher);
        publisher.getBooks().add(newBook);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Publisher count: " + publisherRepository.count());
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Publishers: " + publisher.getBooks().size());
    }
}
