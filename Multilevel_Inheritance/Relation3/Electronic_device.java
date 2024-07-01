package Relation3;

public class Electronic_device {
	private String brand;
	private int price;
	
	public void poweron() {
		System.out.println("Powering on");
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

	public Electronic_device(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Electronic_device [brand=" + brand + ", price=" + price + "]";
	}
	
}
