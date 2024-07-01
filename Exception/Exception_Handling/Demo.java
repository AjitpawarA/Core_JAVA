package Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		operate();
	}

	static void operate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			int x = sc.nextInt();
			System.out.println("division " + 10 / x);
			File f = new File("qwfg");
			FileInputStream fis = new FileInputStream(f);
			fis.read();
		} catch (InputMismatchException e) {
			System.out.println("input mismatch");
		} catch (ArithmeticException e) {
			System.out.println("arithmatic exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}

		System.out.println("END of program");
	}
}
