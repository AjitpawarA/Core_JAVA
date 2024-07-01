package Shopping_Application;

public class Product{
	private String name;
	private int price;
	private int rating;
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, int price, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}


	
}
