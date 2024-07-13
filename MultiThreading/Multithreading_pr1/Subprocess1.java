package Multithreading_pr1;

import java.util.Scanner;

public class Subprocess1 extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num 1:");
		int num1= sc.nextInt();
		System.out.println("num 2:");
		int num2= sc.nextInt();
		System.out.println(num1+num2);
		
	}
}
