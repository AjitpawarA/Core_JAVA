package ArrayList_Practice;

import java.util.ArrayList;

public class Store_Objects_ArrayList {
	public static void main(String[] args) {
		
		// NON GENERIC TYPE ARRAYLITST;
		ArrayList students = new ArrayList();
		
		Student s1 = new Student("Ajit", 23, 120);
		Student s2 = new Student("NIKHIL", 43, 1420);
		Student s3 = new Student("NEHA", 25, 1200);
		Student s4 = new Student("SOTA", 21, 12);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		System.out.println(students);
		System.out.println(students.size());
		

		//non generic proof 
		students.add(10);
		students.add(2.10);
		students.add(true);
		
		System.out.println(students);
		System.out.println(students.size()
				);
		
	}
}
