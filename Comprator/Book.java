package Comprator;

import java.util.Arrays;

public class Book {
	String name;
	int price;
	
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price; 
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]"
				+ "...........................";
	}
	
	public static void main(String[] args) {
//		Book b1 = new Book("HP", 100);
//		Book b2 = new Book("Mp",500);
//		
		Compareprice compare = new Compareprice();
//		
//		System.out.println(compare.compare(b1, b2));
		
		
		
		Book[] books = new Book[4];
		books[0]= new Book("HP",100);
		books[1]= new Book("MP",10);
		books[2]= new Book("FP",150);
		books[3]= new Book("GP",700);
		
		Arrays.sort(books,compare);
		
		for (Book book : books) {
			System.out.println(book.toString());
		}
		
	}
}
