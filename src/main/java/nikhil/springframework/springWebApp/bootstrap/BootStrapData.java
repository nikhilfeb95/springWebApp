package nikhil.springframework.springWebApp.bootstrap;

import nikhil.springframework.springWebApp.domain.Author;
import nikhil.springframework.springWebApp.domain.Book;
import nikhil.springframework.springWebApp.domain.Publisher;
import nikhil.springframework.springWebApp.repositories.AuthorRepository;
import nikhil.springframework.springWebApp.repositories.BookRepository;
import nikhil.springframework.springWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private  final AuthorRepository authorRepository;
    private  final BookRepository bookRepository;
    private  final PublisherRepository publisherRepository;
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book b = new Book("Domain design", "122541");
        eric.getBooks().add(b);
        b.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(b);

        Author nik = new Author("Nikhil", "Mollay");
        Book b1 = new Book("Boii", "123123");
        nik.getBooks().add(b1);
        b1.getAuthors().add(nik);

        authorRepository.save(nik);
        bookRepository.save(b1);
        Publisher pb = new Publisher("Penguin", "Times Square", "NYC" , "New York", "00001");
        pb.getBooks().add(b1);
        pb.getBooks().add(b);
        publisherRepository.save(pb);

        System.out.println("Started Bootstrap");
        System.out.println("Number of books: "+bookRepository.count());
        System.out.println("Number of publishers: " + publisherRepository.count());
        System.out.println("Number of publisher books: " + pb.getBooks().size());
    }
}
