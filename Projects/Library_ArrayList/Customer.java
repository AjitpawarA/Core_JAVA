package Library_ArrayList;

import java.util.ArrayList;

public class Customer {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public static ArrayList createcustissuedbook() {
		return new ArrayList();
	}
	
	
}
