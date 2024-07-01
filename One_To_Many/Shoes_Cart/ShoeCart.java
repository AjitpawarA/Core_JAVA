package Shoes_Cart;

import java.util.ArrayList;

public class ShoeCart {
	ArrayList<Shoe> shoes = new ArrayList<Shoe>();

	public void showallshoes() {
		// TODO Auto-generated method stub
		for (Shoe shoe : shoes) {
			System.out.println("Brand:"+shoe.getBrand() + "----- Color:"+shoe.getBrand()+" ----Price:"+shoe.getPrice()+" ----Size:"+shoe.getPrice());
			System.out.println("-----------------------------------");
		}
	}
	
}
