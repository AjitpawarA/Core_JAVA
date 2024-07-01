package Relation1;

public class Driver {
	public static void main(String[] args) {
		
//		Create Subclass Object and try to access all the properties of both
//		superclass and Subclass.
		Son s1 = new Son(100, "Dadaji", 10, 5);
		//Display message using son method.

		s1.work();
		s1.study();


//		Create Superclass Object and try to access all the properties of both
//		superclass and subclass.
		
		GrandFather f1 = new GrandFather(10, "MAMAji");
		f1.work();
		
		
//		
		
		
		GrandFather f2 = new Son(0, null, 0, 0);
		System.out.println(f2.age);
		System.out.println(f2.name);
		f2.work();
		
		Son s2 = (Son)f2;
		
		s2.study();
		
		
	}
}
