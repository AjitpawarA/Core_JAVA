package Relation3;

public class MobilePhone extends Electronic_device{

	private String sim;
	
	public MobilePhone(String brand, int price, String sim) {
		super(brand, price);
		this.sim=sim;
	}

	
	public String getSim() {
		return sim;
	}


	public void setSim(String sim) {
		this.sim = sim;
	}


	@Override
	public String toString() {
		return "MobilePhone [sim=" + sim + "]";
	}


	public void makeCall() {
		System.out.println("Can make call");
	}
}
