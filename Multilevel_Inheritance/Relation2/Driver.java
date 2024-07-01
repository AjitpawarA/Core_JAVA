package Relation2;

public class Driver {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println(d1);
		d1.makeSound();
		d1.bark();
		System.out.println("..........................");
		
		Mammal m = new Mammal();
		System.out.println(m);
		m.makeSound();
		System.out.println("..........................");
		
		Animal a =new Animal();
		System.out.println(a);
		a.makeSound();
		System.out.println("..........................");
		
		
		Animal a1 = new Mammal();
		System.out.println(a1);
		a1.makeSound();
		System.out.println("..........................");
		
		
		Animal a2 = new Dog();
		System.out.println(a2);
		a2.makeSound();
		Dog d2 = (Dog)a2;
		System.out.println("After downcasting");
		System.out.println(d2);
		d2.bark();
		d2.makeSound();
		System.out.println("..........................");
	}
}
