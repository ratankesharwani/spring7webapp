package guru.springframework.spring7webapp.repositories;

import guru.springframework.spring7webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 12/23/19.
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}