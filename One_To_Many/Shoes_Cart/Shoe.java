package Shoes_Cart;

public class Shoe {
	private String brand;
	private int price;
	private String color;
	private int size;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Shoe(String brand, int price, String color, int size) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Shoe [brand=" + brand + ", price=" + price + ", color=" + color + ", size=" + size + "]";
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
