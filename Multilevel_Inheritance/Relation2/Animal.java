package Relation2;

public class Animal {
	String name;
	int age;
	
	Animal(){
		
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age +"]";
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public static void makeSound() {
		System.out.println("Makes sound");
	}
}
