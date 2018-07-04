package gwjwnsar.movies.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gwjwnsar.movies.model.Movie;

@RepositoryRestResource(collectionResourceRel="movies", path="movies")
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	

}
