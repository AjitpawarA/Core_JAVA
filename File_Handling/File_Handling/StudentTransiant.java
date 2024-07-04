package File_Handling;

import java.io.Serializable;

public class StudentTransiant implements Serializable{
	String name;
	transient String gen;
	
	
	public StudentTransiant(String name, String gen) {
		this.name = name;
		this.gen = gen;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", gen=" + gen + "]";
	}
	
}
