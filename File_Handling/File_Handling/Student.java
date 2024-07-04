package File_Handling;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	String gen;
	
	
	public Student(String name, String gen) {
		super();
		this.name = name;
		this.gen = gen;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", gen=" + gen + "]";
	}
	
	
}
