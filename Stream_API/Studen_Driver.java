package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Studen_Driver {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Ajit", 140),new Student("Abhay", 180),new Student("Amey", 170),new Student("Nikhil", 10));
		
		list.stream().sorted((o1,o2)-> o1.id-o2.id).forEach((n)-> System.out.println(n));
	}
}
