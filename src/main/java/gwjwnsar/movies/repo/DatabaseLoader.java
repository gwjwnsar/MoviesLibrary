package gwjwnsar.movies.repo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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
		
		Movie m = new Movie();
		
		Director d = new Director("Martin Scorsese");
		
		Actor leonardo = new Actor("Leonardo DiCaprio");
		Actor margot = new Actor("Margot Robbie");
		Actor jonah = new Actor("Jonah Hill");
		Actor jordan = new Actor("Jordan Belfort");
		Set<Actor> leadActors = new HashSet<>();
		leadActors.add(leonardo);
		leadActors.add(margot);
		leadActors.add(jonah);
		leadActors.add(jordan);
		
		repoD.save(d);
		
		for (Actor actor : leadActors) {
			repoA.save(actor);
		}
		
		m.setName("The Wolf of Wall Street");
		m.setrDate(LocalDate.parse("2014-01-03"));
		m.setGenre("Biography");
		m.setcImUrl("https://upload.wikimedia.org/wikipedia/en/d/d8/The_Wolf_of_Wall_Street_%282013%29.png");
		m.setDirector(d);
		m.setActors(leadActors);
		
		repoM.save(m);
		
		Movie m2 = new Movie();
		Director d2 = new Director("Ayan Mukerji");
		repoD.save(d2);
		Set<Actor> lActors = new HashSet<>();
		String[] actorArr = {"Ranbir Kapoor","Deepika Padukone","Aditya Roy Kapur","Kalki Koechlin","Madhuri Dixit"};
		for (String str : actorArr) {
			Actor a = new Actor(str);
			lActors.add(a);
			repoA.save(a);
		}
		
		m2.setName("Yeh Jawaani Hai Deewani");
		m2.setGenre("Drama/Romance");
		m2.setcImUrl("https://upload.wikimedia.org/wikipedia/en/1/15/Yeh_jawani_hai_deewani.jpg");
		m2.setrDate(LocalDate.parse("2013-05-31"));
		m2.setDirector(d2);
		m2.setActors(lActors);
		repoM.save(m2);
	}
	

}
