package File_Hadling_Byte_Stream;

import java.io.Serializable;

public class Student implements Serializable {
	
//	private static final long serialVersionUID = 1L;
	String name;
	int age;
	int marks;
	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
	    return String.format("\n Student:\n" +
	                         "  Name:  %s\n" +
	                         "  Age:   %d\n" +
	                         "  Marks: %d", name, age, marks);
	}

	
}
