package Has_a_relationship_early_instance_onee_to_one;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine tata = new Engine("TATA",2000);
		
		Car nano = new Car("NANO",10000,tata);
		
		testImp t = new testImp();
		t.show();

	}

}
