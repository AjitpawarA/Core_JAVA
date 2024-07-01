package Mobile_Battery;

public class Mobile {
	private String brand;
	private int price;
	private int ram;
	private Battery b;
	
	public Mobile(String brand, int price, int ram, Battery b) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", ram=" + ram + ", b=" + b + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	
	public void mDetails() {
		System.out.println("Mobile name: "+ brand +" Price:"+price+" Ram: "+ ram+" Battery: "+ b);
	}
	
}
