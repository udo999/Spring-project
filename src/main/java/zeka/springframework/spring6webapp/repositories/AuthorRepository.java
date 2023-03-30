package zeka.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import zeka.springframework.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository <Author, Long>{
}
