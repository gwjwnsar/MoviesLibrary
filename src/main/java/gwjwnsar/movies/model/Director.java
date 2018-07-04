package gwjwnsar.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Director {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	public Director() {
	}

	public Director(String name) {
		this.name = name;
	}

	public Director(int id, String name) {
		this.id = id;
		this.name = name;
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

}
