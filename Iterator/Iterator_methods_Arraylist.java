package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_methods_Arraylist {
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		Iterator<Integer> i = l.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());

//		System.out.println(i.next()); //it will throw an exception - nosuchelement
		
		Iterator<Integer> i1= l.iterator();
		
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		System.out.println(i1.hasNext());  // this line will not throw an exception 
//		System.out.println(i1.next());  // will throw an exception
	
		Iterator<Integer> i2 = l.iterator();
		
		System.out.println("Using loops ---");
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		Iterator<Integer> i3 = l.iterator();
		
		System.out.println("Addition of elements");
		int sum =0;
		while(i3.hasNext()) {
			sum = sum + (int)i3.next();
		}
		System.out.println(sum);
	}
}
