package Relation5_Has_a_Bike_Engine;

public class Driver {
public static void main(String[] args) {
	
	Bike ninja = new Bike(2020, "Kawasaki", new Enigne("Fire", 250));
	
	System.out.println(ninja);
	
	Enigne e = new Enigne("Fule", 150);
	System.out.println(e);
}
}
