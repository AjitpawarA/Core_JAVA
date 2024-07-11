package Shoping_Store_Using_Files;

import java.util.ArrayList;

public class Shop {
	ArrayList<Product> products = new ArrayList<Product>();
	
	
	public void adddefaultproducts() {
		products.add(new Product("Laptop", 1500, 10));
        products.add(new Product("Smartphone", 800, 20));
        products.add(new Product("Tablet", 500, 15));
        products.add(new Product("Monitor", 300, 8));
        products.add(new Product("Keyboard", 50, 25));
        products.add(new Product("Mouse", 25, 30));
        products.add(new Product("Printer", 200, 12));
        products.add(new Product("Headphones", 100, 18));
        products.add(new Product("Webcam", 70, 14));
        products.add(new Product("Router", 60, 22));
        products.add(new Product("Smartwatch", 150, 16));
        products.add(new Product("Speaker", 120, 19));
        products.add(new Product("Microphone", 80, 13));
        products.add(new Product("Charger", 20, 28));
	}
}
