package throws_exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Throws_exception {
public static void main(String[] args) {
	caller();
}	

static void caller() {
	try {
		called();
	} catch (ArithmeticException e) {
		System.out.println("Arithmatic exception occurd");
	} catch (IOException e) {
		System.out.println("I0 exception occurd");
	}
}
static void called() throws ArithmeticException, IOException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Num 1:");
	int num1 = sc.nextInt();
	System.out.println("Num 2:");
	int num2 = sc.nextInt();
	System.out.println("res:"+num1/num2);
	
	File f = new File("www");
	FileInputStream fis = new FileInputStream(f);
	fis.read();
			
}
}
