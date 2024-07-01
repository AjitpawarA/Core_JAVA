package Shopping_Application;

import java.util.ArrayList;
import java.util.Scanner;

import Shopping_App.Product;
import Shopping_App.User;

public class Store {
	public static ArrayList createnewarraylist() {
		return new ArrayList<Product>();
	}

	private String owner_name;
	private long phone;

	ArrayList<Product> products;
	ArrayList<User> users = new ArrayList<User>();

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Store(String owner_name, long phone, ArrayList<Product> products, ArrayList<User> users) {
		super();
		this.owner_name = owner_name;
		this.phone = phone;
		this.products = products;
		this.users = users;
	}

	public Store() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Store [owner_name=" + owner_name + ", phone=" + phone + ", products=" + products + ", users=" + users
				+ "]";
	}

	public static void adddefaulbooks(ArrayList<Product> prod) {
		// TODO Auto-generated method stub
		prod.add(new Product("Soap", 10, 5));
		prod.add(new Product("Soap", 10, 5));
		prod.add(new Product("Bread", 25, 2));
		prod.add(new Product("Milk", 3, 1));
		prod.add(new Product("Eggs", 22, 3));
		prod.add(new Product("Cheese", 5, 1));
		prod.add(new Product("Butter", 4, 1));
		prod.add(new Product("Apples", 15, 5));
		prod.add(new Product("Bananas", 12, 4));
		prod.add(new Product("Chicken", 8, 1));
		prod.add(new Product("Beef", 12, 8));
		prod.add(new Product("Tomatoes", 28, 5));
		prod.add(new Product("Potatoes", 15, 0));
		prod.add(new Product("Carrots", 17, 5));
		System.out.println("products added sucessfully");

	}

	public static void addcustome_prod(ArrayList prod, Scanner sc) {
		System.out.println("enter product name:");
		String pname = sc.next();
		System.out.println("Enter price:");
		int p_price = sc.nextInt();
		System.out.println("Enter ratings 1-5:");
		int p_rating = sc.nextInt();
		prod.add(new Product(pname, p_price, p_rating));
	}

	public static void check_Availability(ArrayList prod, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter product name to check availability:");
		String p_name = sc.next();
		boolean check = false;
		for (Object object : prod) {
			Product p = (Product) object;
			if (p.getName().equals(p_name)) {
				check = true;
			}
		}
		if (check == true) {
			System.out.println("Product is available");
		} else {
			System.out.println("Product not found");
		}

	}

	public static void remove_from_stock(ArrayList prod, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter product name to remove:");
		String p_name = sc.next();
		Product toberemoved = null;
		boolean check = false;
		for (Object object : prod) {
			Product p = (Product) object;
			if (p.getName().equals(p_name)) {
				toberemoved = p;
				check = true;
			}
		}
		prod.remove(toberemoved);
		if (check == true) {
			System.out.println("Product is removed from the store-------");
		} else {
			System.out.println("Product not available to remove");
		}

	}

}
