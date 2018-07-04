package gwjwnsar.movies.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gwjwnsar.movies.model.Director;

@RepositoryRestResource(collectionResourceRel="directors", path="directors")
public interface DirectorRepository extends JpaRepository<Director, Integer> {

}
