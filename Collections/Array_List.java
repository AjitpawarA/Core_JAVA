package Collections;

import java.util.ArrayList;

public class Array_List {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add("HARRY");
		l.add('a');
		l.add(true);
		l.add(50.55);
		
		System.out.println(l);
		
		l.add(2,50);  // inserting element at particular index 
		
		System.out.println(l);
		System.out.println(l.size());// number of elements in the arraylist
		
	}
}
