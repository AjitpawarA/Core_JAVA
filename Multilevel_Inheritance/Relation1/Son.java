package Relation1;

public class Son extends Father{
	int grade;
	public Son(int age, String name, int numchildern ,int grade) {
		super(age, name, numchildern);
		this.grade=grade;
		// TODO Auto-generated constructor stub
	}
	
	
	public static void study() {
		System.out.println("Son studying");
	}

	
	
	
}
