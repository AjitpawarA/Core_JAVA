package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally_Block {
	public static void main(String[] args) {
		operate();
	}

	static void operate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			int x = sc.nextInt();
			System.out.println("division " + 10 / x);
			
		} catch (InputMismatchException e) {
			System.out.println("input mismatch");
		} catch (ArithmeticException e) {
			operate();
		}
		finally {
			System.out.println();
		}

		System.out.println("END of program");
	}
}
