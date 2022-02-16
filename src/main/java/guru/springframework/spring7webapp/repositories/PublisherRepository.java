package guru.springframework.spring7webapp.repositories;
import guru.springframework.spring7webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 12/23/19.
 */
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}