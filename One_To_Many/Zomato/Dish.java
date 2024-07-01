package Zomato;

public class Dish {
	private String dishname;
	private int price;
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Dish [dishname=" + dishname + ", price=" + price + "]";
	}
	public Dish(String dishname, int price) {
		super();
		this.dishname = dishname;
		this.price = price;
	}
	
}
