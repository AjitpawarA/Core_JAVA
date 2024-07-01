package Ageexception;

import java.util.Scanner;

public class IssuseLiacence {
	public static void main(String[] args) {
		try {
			isueliacence();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	private static void isueliacence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		
		if(age<18) {
			throw new UnderAgeException("Under age..");
		}
		else if(age>60) {
			throw new OverAgeException("over age....");
		}
		else {
			System.out.println("Liacence issued sucessfully.....");
		}
		
		
	}
}
