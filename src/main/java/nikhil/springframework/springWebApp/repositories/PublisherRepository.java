package nikhil.springframework.springWebApp.repositories;

import nikhil.springframework.springWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
