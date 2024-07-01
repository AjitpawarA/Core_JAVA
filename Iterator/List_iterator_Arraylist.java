package Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iterator_Arraylist {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		ListIterator i = l.listIterator();
		
		// moving forward is same as iterator 
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		//moving backword
		
		ListIterator i1 = l.listIterator(l.size());
		
		while(i1.hasPrevious()) {
			System.out.print(i1.previous()+" ");
		}
		
	}
}
