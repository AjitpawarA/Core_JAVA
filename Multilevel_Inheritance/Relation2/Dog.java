package Relation2;

public class Dog extends Mammal{

	String breed;
	Dog() {
		
	}
	
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", gender=" + gender + ", name=" + name + ", age=" + age +"]";
	}

	public Dog(String name, int age, String gender, String breed) {
		super(name, age, gender);
		this.breed=breed;
		// TODO Auto-generated constructor stub
	}
	
	
	public static void bark() {
		System.out.println("Dog is barking");
	}

}
