package Zomato;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Zomato zoma = new Zomato();
		zoma.addhotesl();
		
		ArrayList<Dish> usercart= new ArrayList<Dish>();
		
		System.out.println("Welcome to ZOMATO");
		
		boolean exit = true;
		
		while(exit) {
			System.out.println("Choose correct option :");
			System.out.println("1: show all hotesl");
			System.out.println("2: sort hotels by rating");
			System.out.println("3: choose hotel to order:");
			System.out.println("0: exit....");
			
			int choise =sc.nextInt();
			
			switch(choise) {
			case 1:{
				System.out.println("Hotel names :");
				for (Hotel hotel : zoma.hotels) {
					System.out.println(hotel.getHotelname());
				}
			}
			break;
			case 2:{
				
			}
			break;
			case 3:{
				System.out.println("Enter hotel name :");
				String hotelname=sc.next();
				Hotel selectedhotel=null;
				for (Hotel hotel : zoma.hotels) {
					if(hotel.getHotelname().equals(hotelname)) {
						selectedhotel=hotel;
					}
				}
				
				if(selectedhotel!=null) {
					System.out.println("Hotel found");
				}
				else {
					System.out.println("Hotel not found");
				}
				
				if(selectedhotel!=null) {
					boolean exitcu = true;
					while(exitcu) {
						System.out.println("Choose correct option:");
						System.out.println("1: choose dish ");
						System.out.println("2: see all dishes");
						System.out.println("3: see cart");
						System.out.println("4: confirt order");
						System.out.println("0: exit");
						
						int ch = sc.nextInt();
						
						switch(ch){
							case 1:{
							System.out.println("How many dish ?");
							int noofdishes=sc.nextInt();
							
							for(int i=0; i<noofdishes; i++) {
								System.out.println("Enter dish name :");
								String dishname=sc.next();
								Dish tobeadded =null;
								boolean dishadded=true;
								for (Dish dish : selectedhotel.menulist) {
									if(dish.getDishname().equals(dishname)) {
										tobeadded=dish;
										dishadded=false;
									}
								}
								usercart.add(tobeadded);
								if(dishadded=false) {
									System.out.println("Dish added ");
								}
							}
							}
							break;
							
							case 2:{
								System.out.println("Dish list");
								for (Dish dish : selectedhotel.menulist) {
									System.out.println("Dish: "+dish.getDishname()+ " price:"+dish.getPrice());
								}
							}
							break;
							case 3:{
								if(usercart.size()!=0){
									for (Dish dish : usercart) {
										System.out.println("Dish:"+dish.getDishname());
									}
								}
							}
							break;
							case 0:{
								exitcu=false;
							}
							break;
							default:{
								System.out.println("wrong choise");
							}
						}
					}
				}
				
				else {
					System.out.println("Hotel not selected ");
				}
			}
			case 0:{
				exit=false;
			}
			default:{
				System.out.println("Wrong choise");
			}
			}
			
		}
	}
}
