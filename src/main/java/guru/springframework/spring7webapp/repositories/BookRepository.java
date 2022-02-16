package guru.springframework.spring7webapp.repositories;

import guru.springframework.spring7webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 12/23/19.
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}