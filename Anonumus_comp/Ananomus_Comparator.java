package Anonumus_comp;

import java.util.ArrayList;
import java.util.Collections;


public class Ananomus_Comparator {
	public static void main(String[] args) {
		ArrayList<Student> students= new ArrayList<Student>();
		students.add(new Student("Ajit", 10));
		students.add(new Student("Aria", 12));
		students.add(new Student("Ben", 11));
		students.add(new Student("Cleo", 13));
		students.add(new Student("David", 14));
		students.add(new Student("Eva", 15));
		students.add(new Student("Felix", 16));
		students.add(new Student("Grace", 17));
		students.add(new Student("Henry", 18));
		students.add(new Student("Isla", 19));
		students.add(new Student("Jack", 20));
		
		System.out.println(students);
		
//		Collections.sort(students);

	}
}
