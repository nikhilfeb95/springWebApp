package nikhil.springframework.springWebApp.repositories;

import nikhil.springframework.springWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
