package ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class aaa {
 
	public static void main(String[] args) {
		
		ArrayList<String> a= new ArrayList<>();
		
		
		ArrayList b= new ArrayList<>();

		b.add(new Student1("ajit",101,"hh",10));

		b.add(new Student1("ajit",101,"hh",10));

		b.add(new Student1("ajit",101,"hh",10));

		b.add(new Student1("ajit",101,"hh",10));
		
		Collections.sort(b);
		System.out.println(a);
		
		
	}
}
