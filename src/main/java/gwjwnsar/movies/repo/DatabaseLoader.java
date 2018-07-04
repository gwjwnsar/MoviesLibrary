package gwjwnsar.movies.repo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gwjwnsar.movies.model.Actor;
import gwjwnsar.movies.model.Director;
import gwjwnsar.movies.model.Movie;

@Component
public class DatabaseLoader implements CommandLineRunner {
	
	private final ActorRepository repoA;
	private final DirectorRepository repoD;
	private final MovieRepository repoM;
	
	@Autowired
	public DatabaseLoader(ActorRepository repoA, DirectorRepository repoD, MovieRepository repoM) {
		this.repoA = repoA;
		this.repoD = repoD;
		this.repoM = repoM;
	}

	@Override
	public void run(String... args) throws Exception {
		this.repoA.save(new Actor(1, "Leonardo DiCaprio"));
		this.repoA.save(new Actor(2, "Margot Robbie"));
		this.repoA.save(new Actor(3, "Jonah Hill"));
		this.repoA.save(new Actor(4, "Jordan Belfort"));
		this.repoA.save(new Actor(5, "Tim Robbins"));
		this.repoA.save(new Actor(6, "Morgan Freeman"));
		this.repoA.save(new Actor(7, "Ranbir Kapoor"));
		this.repoA.save(new Actor(8, "Deepika Padukone"));
		this.repoA.save(new Actor(9, "Salman Khan"));
		this.repoA.save(new Actor(10, "Aamir Khan"));
		this.repoA.save(new Actor(11, "Akshay Kumar"));
		
		this.repoD.save(new Director(1,"Martin Scorsese"));
		this.repoD.save(new Director(2,"Frank Darabont"));
		this.repoD.save(new Director(3,"Ayan Mukerji"));
		this.repoD.save(new Director(4,"Subhash Kapoor"));
		this.repoD.save(new Director(5,"Sanjay Leela Bhansali"));
		this.repoD.save(new Director(6,"Rajkumar Hirani"));
		this.repoD.save(new Director(7,"Neeraj Pandey"));
		this.repoD.save(new Director(8,"Imtiaz Ali"));
		
		
	}
	

}
