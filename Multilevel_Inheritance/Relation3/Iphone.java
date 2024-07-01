package Relation3;

public class Iphone extends MobilePhone{

	private String iosv;
	public Iphone(String brand, int price, String sim, String iosv) {
		super(brand, price, sim);
		this.iosv=iosv;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Iphone [iosv=" + iosv + "]";
	}

	public void dynamicIsland() {
		System.out.println("This is iphone version ");
	}
}
