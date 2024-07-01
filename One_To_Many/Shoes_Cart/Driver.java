package Shoes_Cart;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	ShoeCart s=new ShoeCart();
	s.shoes.add(new Shoe("Nike", 100, "Red", 42));
    s.shoes.add(new Shoe("Adidas", 120, "Blue", 43));
    s.shoes.add(new Shoe("Puma", 90, "Green", 41));
    s.shoes.add(new Shoe("Reebok", 110, "Black", 44));
    s.shoes.add(new Shoe("Under Armour", 130, "White", 40));
    s.shoes.add(new Shoe("New Balance", 105, "Yellow", 42));
    s.shoes.add(new Shoe("Asics", 95, "Purple", 43));
    s.shoes.add(new Shoe("Skechers", 80, "Orange", 41));
    s.shoes.add(new Shoe("Fila", 85, "Gray", 44));
    s.shoes.add(new Shoe("Converse", 75, "Pink", 40));
    
    ArrayList<Shoe> usercart= new ArrayList<Shoe>();
    
    
    
    
    boolean exit = true;
    
    while(exit) {
    	System.out.println("Choose correct option :");
    	System.out.println("1:show all shoes");
    	System.out.println("2:order shoe");
    	System.out.println("3:cancel shoe");
    	System.out.println("4:Show usercart");
    	System.out.println("0:exit");
    	
    	int choise = sc.nextInt();
    	
    	switch(choise) {
    	case 1:{
    		s.showallshoes();
    	}
    	break;
    	case 2:{
    		System.out.println("Enter shoe brand:");
    		String brand=sc.next();
    		Shoe tobeadded =null;
    		boolean added = false;
    		for (Shoe shoe : s.shoes) {
				if(shoe.getBrand().equals(brand)) {
					tobeadded=shoe;
					added = true;
				}
			}
    		usercart.add(tobeadded);
    		if(added==true) {
    			System.out.println("shoe added to the cart");
    		}
    		else {
    			System.out.println("Shoe not found in store");
    		}
    	}
    	break;
    	case 3:{
    		usercart.clear();
    		if(usercart.size()==0){
    			System.out.println("User cart empty");
    		}
    	}
    	break;
    	case 4:{
    		for (Shoe shoe : usercart) {
				System.out.println("Shoe: "+shoe.getBrand());
			}
    	}
    	break;
    	case 0:{
    		exit=false;
    	}
    	break;
    	default:{
    		System.out.println("Wrong choise");
    	}
    	
    	}
    }
}
}
