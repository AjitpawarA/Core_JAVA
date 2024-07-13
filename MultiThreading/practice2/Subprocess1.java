package practice2;

import java.util.Scanner;

public class Subprocess1 extends Thread{
	public void run() {
		System.out.println("this is subprocess 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num for subp 1");
		int num1 =sc.nextInt();
		System.out.println(num1);
	}
}
