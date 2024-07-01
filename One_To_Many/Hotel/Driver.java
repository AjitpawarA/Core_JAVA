package Hotel;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuCard m = new MenuCard();
		m.addnorthmenu();
		m.addsouthmenu();
		
		ArrayList<Dish> usercart = new ArrayList<Dish>();
		
		boolean exit=true;
		
		while(exit) {
			System.out.println("Choose correct option:");
			System.out.println("1:Show all menu");
			System.out.println("2:Order food");
			System.out.println("3:confirm order");
			System.out.println("4:cancel order");
			System.out.println("0:exit ...come out of hotel");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("South Indian ------");
				for (Dish d : m.southindian) {
					System.out.println("--"+d.getName()+" :"+d.getPrice()+"rs");
				}
				System.out.println("North Indian ------");
				for (Dish d : m.northindian) {
					System.out.println("--"+d.getName()+" :"+d.getPrice()+"rs");
				}
				
			}
			break;
			case 2:{
				System.out.println("sout or North?");
				System.out.println("1:South");
				System.out.println("2:North");
				int ch = sc.nextInt();
				
				switch(ch) {
				case 1:{
					System.err.println("how many food items");
					int noofitems=sc.nextInt();
					for(int i=0; i<noofitems; i++) {
						System.out.println("enter food name :");
						String dishname=sc.next();
						for (Dish d : m.southindian) {
							if(d.getName().equals(dishname)) {
								usercart.add(d);
							}
						}
					}
					System.out.println(noofitems+" Fooditems added to the cart");
				}
				break;
				case 2:{
					System.err.println("how many food items");
					int noofitems=sc.nextInt();
					for(int i=0; i<noofitems; i++) {
						System.out.println("enter food name :");
						String dishname=sc.next();
						for (Dish d : m.northindian) {
							if(d.getName().equals(dishname)) {
								usercart.add(d);
							}
						}
					}
					System.out.println(noofitems+" Fooditems added to the cart");
				}
				break;
				default:{
					System.out.println("Wrong choice");
				}
				}
			}
			break;
			case 3:{
				if(usercart.size()!=0) {
					int totalcost=0;
					for (Dish dish : usercart) {
						totalcost=totalcost+dish.getPrice();
					}
					System.out.println("Total cost is :"+totalcost);
					System.out.println("Thank you for visiting ");
				}
				else {
					System.out.println("Nothing u seleted");
				}
			}
			break;
			case 4:{
				usercart.clear();
				System.out.println("order canceled ");
			}
			break;
			case 0:{
				exit=false;
			}
			break;
			default:{
				System.out.println("Wrong choice");
			}
			}
			
		}
		
		
		
		
	}
}
