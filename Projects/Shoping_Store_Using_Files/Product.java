package Shoping_Store_Using_Files;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Product implements Serializable{
	private String pro_name;
	private int price;
	private int quantity;

	@Override
	public String toString() {
		return "Product [pro_name=" + pro_name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public Product(String pro_name, int price, int quantity) {
		super();
		this.pro_name = pro_name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public static void checkavailability(ArrayList<Product> list, Scanner sc) {
		System.out.println("Enter product name:");
		String pname=sc.next();
		boolean available = false;
		int quantity=0;
		for (Product product : list) {
			if(product.getPro_name().equals(pname)) {
				available=true;
				quantity=product.getQuantity();
			}
			
		}
		if(available==true) {
			System.out.println("Product is available to shop ");
			System.out.println("Available quantiy in the store is: "+quantity);
		}
		else {
			System.out.println("Product not available...sorry, will let you know once product is available");
		}
	}

}
