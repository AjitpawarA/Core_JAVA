package Shopping_Application;
import java.util.ArrayList;
import java.util.Scanner;

import Shopping_App.Cart;
import Shopping_App.Product;
import Shopping_App.Store;
import Shopping_App.User;

public class User {
	
	private String name;
	private long phone;
	private int passward;
	
	Cart c;
	
	User(){
		
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", passward=" + passward + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getPassward() {
		return passward;
	}

	public void setPassward(int passward) {
		this.passward = passward;
	}

	public User(String name, long phone, int passward, Cart c) {
		super();
		this.name = name;
		this.phone = phone;
		this.passward = passward;
		this.c=c;
	}

	public static void create_user_account(Scanner sc, ArrayList<User> users) {
		
		System.out.println("Enter user name:");
		String name=sc.next();
		System.out.println("Enter user age:");
		int age = sc.nextInt();
		System.out.println("Enter user passward:");
		int passward=sc.nextInt();
		
		User new_user = new User(name,age,passward,new Cart(new ArrayList<Product>()));
		users.add(new_user);
		System.out.println("User account created sucessfully");
	}

	public static void login_user_account(Scanner sc,Store s) {
		// TODO Auto-generated method stub

		 System.out.println("Enter your customer login credentials ----");
		 System.out.println("Enter name");
		 String name = sc.next();
		 System.out.println("Enter pasward:");
		 int passward= sc.nextInt();
		 boolean found = false;
		 User founduser=null;
		 for (Object object : s.users) {
			User u = (User)object;
			
			if(u.getName().equals(name) && u.getPassward()==passward) {
				found=true;
				founduser=u;
			}
		}
		 
		if(found==true) {
			System.out.println("user found");
			boolean exitcust=true;
			
			while(exitcust) {
				System.out.println("Choose the correct option:");
				System.out.println("1: shop the products by name");
				System.out.println("2: show my cart :");
				System.out.println("3: remove product from cart");
				System.out.println("4: show total cost");
				System.out.println("0: exit");
				
				int chh= sc.nextInt();
				
				switch(chh) {
				case 1:{
					System.out.println("----shop from these products---");
					System.out.println("----------Available---------");
					for (Object obj : s.products) {
						Product p = (Product)obj;
						System.err.println(p.getName()+" - "+p.getPrice());
					}
					System.out.println("Enter product to add in cart");
					String toaddname=sc.next();
					
					Product tobeadded=null;
					boolean added = false ;
					for (Object product : s.products) {
						Product p = (Product)product;
						if(p.getName().equalsIgnoreCase(toaddname)) {
							tobeadded=p;
							added=true;
						}
					}
					founduser.c.usercart.add(tobeadded);
					if(added==true) {
						System.out.println("Product added to the cart");
					}
					else {
						System.out.println("Product not available to shop");
					}
					
					
				}
				break;
				case 2:{
					for (Object obj : founduser.c.usercart) {
						Product p = (Product)obj;
						System.out.println(p);
					}
				}
				break;
				case 3:{
					System.out.println("Enter product to remove from the cart");
					String toaddname=sc.next();
					
					Product toberemoved=null;
					boolean removed = false ;
					for (Object product : founduser.c.usercart) {
						Product p = (Product)product;
						if(p.getName().equalsIgnoreCase(toaddname)) {
							toberemoved=p;
							removed=true;
						}
					}
					founduser.c.usercart.remove(toberemoved);
					if(removed==true) {
						System.out.println("Product removed from the cart");
					}
					else {
						System.out.println("Product not in the cart");
					}
				}
				break;
				case 0:{
					exitcust= false;
				}
				break;
				case 4:{
					int total = 0;
					
					for (Object obj : founduser.c.usercart) {
						Product p = (Product)obj;
						total=total+(int)p.getPrice();
					}
					System.out.println("Total cose:"+total);
				}
				break;
				default:{
					System.out.println("Wrong choise");
				}
				}
			}
		}
		else {
		   System.out.println("User not found");
		}
		
	}

}
