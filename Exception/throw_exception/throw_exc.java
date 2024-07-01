package throw_exception;

import java.util.Scanner;

public class throw_exc {
	public static void main(String[] args) {
		try {
			caller();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			caller();
		}
	}
	static void caller() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1:");
		int x = sc.nextInt();
		System.out.println("num2:");
		int y = sc.nextInt();
		
		if(y==0) {
			throw new WrongInputException("Wrong input ...please enter corrct input");
		}
		else {
			System.out.println("res"+x/y);
		}
	}
}
