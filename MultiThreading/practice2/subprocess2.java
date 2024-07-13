package practice2;

import java.util.Scanner;

public class subprocess2 extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("enter num :");
			int num = sc.nextInt();
			System.out.println(num);
		}
	}
}