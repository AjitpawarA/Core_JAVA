package Relation2;

public class Mammal extends Animal{

	String gender;
	
	Mammal(){
		
	}
	
	
	@Override
	public String toString() {
		return "Mammal [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}


	public Mammal(String name, int age, String gender) {
		super(name, age);
		this.gender=gender;
		// TODO Auto-generated constructor stub
	}

	
	

}
