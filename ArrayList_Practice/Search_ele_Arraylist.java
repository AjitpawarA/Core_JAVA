package ArrayList_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Search_ele_Arraylist {
	public static ArrayList<Student1> searchele(ArrayList<Student1> students, String key){
		ArrayList<Student1> res = new ArrayList<Student1>();
		Iterator i =students.iterator();
		while(i.hasNext()) {
			Student1 s = (Student1)i.next();
			if(s.name.equals(key)) {
				res.add(s);
			}
		}
		return res;
	}
	public static void main(String[] args) {
        ArrayList<Student1> students = new ArrayList<>();

        students.add(new Student1("Ravi", 20, "Delhi", 85));
        students.add(new Student1("Ravi", 22, "Mumbai", 90));
        students.add(new Student1("Sunil", 21, "Chennai", 88));
        students.add(new Student1("Ravi", 23, "Kolkata", 92));
        students.add(new Student1("Raj", 19, "Bangalore", 80));
        students.add(new Student1("Sita", 20, "Pune", 87));
        students.add(new Student1("Mohan", 22, "Hyderabad", 89));
        students.add(new Student1("Geeta", 21, "Ahmedabad", 91));
        students.add(new Student1("Vikas", 23, "Jaipur", 86));
        students.add(new Student1("Pooja", 19, "Lucknow", 93));

        for (Student1 s : students) {
			System.out.println(s.toString());
		}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to find the student:");
        String keyname = sc.nextLine();
            
//        for (Student1 ele : students) {
//            if (ele.name.equals(keyname)) {
//                System.out.println(ele);
//            }
//        }
        
//        System.out.println(searchele(students, keyname));
        
        if(searchele(students, keyname).size()!=0) {
        	System.out.println(searchele(students, keyname));
        }else {
        	System.out.println("Not found");
        }
        
    }
}
