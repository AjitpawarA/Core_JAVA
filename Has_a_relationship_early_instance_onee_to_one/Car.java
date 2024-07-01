package Has_a_relationship_early_instance_onee_to_one;

public class Car {
	String model;
	int price;
	
	Engine e;
	
	Car(){
		
	}
	
	Car(String model , int price , Engine e){
		this.model=model;
		this.price=price;
		this.e=e;
	}
	
}
