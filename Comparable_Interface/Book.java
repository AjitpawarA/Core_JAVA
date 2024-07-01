package Comparable_Interface;

public class Book implements Comparable{
	 @Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	String name;
	 int price;
	 
	 Book(String name, int price){
		 this.name=name;
		 this.price=price;
	 }
	
	@Override
	public int compareTo(Object o) {
		Book b = (Book)o;
		if(this.price==b.price) {
			return 0;
		}
		else if(this.price<b.price) {
			return 1;
		}
		else
			return -1;
	}

	

}
