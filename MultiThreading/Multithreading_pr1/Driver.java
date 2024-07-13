package Multithreading_pr1;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	public static void main(String[] args) {
		
		Subprocess1 s1 = new Subprocess1();
		
		Subprocess2 s2 = new Subprocess2();
		s1.start();
		s2.start();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(12);
		arr.add(14);
		arr.add(1);
		
		 
		
	}
}
