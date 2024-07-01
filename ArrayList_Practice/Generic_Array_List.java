package ArrayList_Practice;

import java.util.ArrayList;

public class Generic_Array_List {
	public static void main(String[] args) {
		
		// GENERIC TYPE ARRAYLITST;
		ArrayList<Student> students = new ArrayList<>();
		
		Student s1 = new Student("Ajit", 23, 120);
		Student s2 = new Student("NIKHIL", 43, 1420);
		Student s3 = new Student("NEHA", 25, 1200);
		Student s4 = new Student("SOTA", 21, 12);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		//not possible
//		students.add(10);
		
		System.out.println(students);
		System.out.println(students.size());
}
	}
