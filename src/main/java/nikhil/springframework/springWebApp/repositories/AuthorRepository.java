package nikhil.springframework.springWebApp.repositories;

import nikhil.springframework.springWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
