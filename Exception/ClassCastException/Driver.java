package ClassCastException;

public class Driver {
	public static void main(String[] args) {
		//upcasting
		Vehicle v = new Bike();
		
		//downcasting
		//exception will occur in the code:  classcastexception 
		Car c = (Car)v;
		
	}
}
