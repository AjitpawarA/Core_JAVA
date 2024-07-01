package Comparable_Interface;

import java.util.Arrays;

public class BookDriver {
	public static void main(String[] args) {

		Book[] books = new Book[4];
		
		books[0]= new Book("HP",100);
		books[1]= new Book("MP",10);
		books[2]= new Book("FP",150);
		books[3]= new Book("GP",700);
		
		Arrays.sort(books);
		
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
}
