package Hotel;

public class Dish {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Dish(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + "]";
	}
}
