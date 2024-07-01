package One_to_many;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

//		Car lambo = new Car("TATA", 111110);
//		
//		System.out.println(lambo.ccomp);
//		System.out.println(lambo.age);
//		lambo.addtyre(new Tyre("MRF",50));
//		lambo.addtyre(new Tyre("Ciat",50));
//		lambo.addtyre(new Tyre("appolo",50));
//		lambo.addtyre(new Tyre("Mrf",50));
//		lambo.gettyre();
//		

		System.out.println("Want to buy car ? y/n");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.equals("y")) {
			System.out.println("Enter Car comp");
			String ccomp= sc.next();
			System.out.println("Enter age");
			int age = sc.nextInt();
			Car c1= new Car(ccomp,age);
			System.out.println("Want to choose car tyres by your own ? y/n" );
			if(sc.next().equals("y")) {
				System.out.println("Enter tyre comp and radius of the tyre:");
				for(int i =0; i<4; i++) {
					System.out.println("Enter Tyre info: "+i+" :");
					c1.addtyre(new Tyre(sc.next(), sc.nextInt()));
				}
				
			}
			else {
				System.out.println("Your car is ready with default tyres");
			}
			
			System.out.println("Want to see your CAR info:");
			if(sc.next().equals("y")) {
				c1.getcar();
				c1.gettyre();
			}
		}
		else {
			System.out.println("Thank you");
		}
	}
}
