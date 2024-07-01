package Comp_cpu;

public class Computer {
	private String brand;
	private int price;
	
	Cpu cpu;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public Computer(String brand, int price,Cpu cpu) {
		super();
		this.brand = brand;
		this.price = price;
		this.cpu=cpu;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + "Cpu:" +cpu + "]";
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
