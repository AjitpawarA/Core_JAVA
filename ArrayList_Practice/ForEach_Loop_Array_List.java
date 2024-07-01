package ArrayList_Practice;

import java.util.ArrayList;

public class ForEach_Loop_Array_List {
	public static void main(String[] args) {
		
		ArrayList<Empoyee> employees = new ArrayList<Empoyee>();
		
		employees.add(new Empoyee("ajit", 101, 400));
		employees.add(new Empoyee("Nikhil", 102, 5000));
		employees.add(new Empoyee("Sandeep", 103, 540000));
		employees.add(new Empoyee("Neha", 104, 510000));
		
//		
		for (Empoyee empoyee : employees) {
			if(empoyee.getSalary()>5000) {
				System.out.println(empoyee);
			}
		}
		
		
		for (Empoyee empoyee : employees) {
			char x = empoyee.getName().charAt(0);
			if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
				System.out.println(empoyee);
			}
		}


	}
}
