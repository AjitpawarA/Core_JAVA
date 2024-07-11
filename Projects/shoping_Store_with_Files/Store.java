package shoping_Store_with_Files;

import java.util.ArrayList;

public class Store {
	ArrayList<String> products = new ArrayList<String>();

	public Store(ArrayList<String> products) {
		super();
		this.products = products;
	}

	public Store() {
		super();
	}
	
	
	public void addDefaultProducts() {
		products.add("Soap");
		products.add("Sugar");
		products.add("Chai");
		products.add("Paste");
		products.add("Milk");
		products.add("Salt");
		products.add("Oats");
		products.add("Brush");
	}

	@Override
	public String toString() {
		return "Store [products=" + products + "]";
	}
	
	
	
}
