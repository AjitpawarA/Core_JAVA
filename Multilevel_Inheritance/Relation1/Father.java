package Relation1;

public class Father extends GrandFather{
	int numchildern;
	public Father(int age, String name, int numchildern) {
		super(age, name);
		this.numchildern = numchildern;
	}
	
	public static void provideforFamily()
	{
		System.out.println("Fathr provider for family");
	}
}
