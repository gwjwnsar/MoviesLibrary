package gwjwnsar.movies.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private int id;
	@NotNull
	private String name;
	private String cImUrl;
	@NotNull
	private LocalDate rDate;
	private String genre;
	
	@NotNull
	@ManyToMany
	@JoinTable(
			name="movie_actor",
			joinColumns=@JoinColumn(name="movie_id", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="actor_id", referencedColumnName="id"))
	private Set<Actor> actors;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="director_id", referencedColumnName="id")
	private Director director;

	public Movie() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getcImUrl() {
		return cImUrl;
	}

	public void setcImUrl(String cImUrl) {
		this.cImUrl = cImUrl;
	}

	public LocalDate getrDate() {
		return rDate;
	}

	
	public void setrDate(LocalDate rDate) {
		this.rDate = rDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Set<Actor> getActors() {
		return actors;
	}

	
	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	public Director getDirector() {
		return director;
	}

	
	public void setDirector(Director director) {
		this.director = director;
	}
	
	
	
}
