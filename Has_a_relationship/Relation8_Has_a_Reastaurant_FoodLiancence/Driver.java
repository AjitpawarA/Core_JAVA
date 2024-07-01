package Relation8_Has_a_Reastaurant_FoodLiancence;

public class Driver {
	public static void main(String[] args) {
		Restaurant shivar = new Restaurant("Shivar", "Vita", new FooLicence(1212));
		System.out.println(shivar);
	}
}
