package Zomato;

import java.util.ArrayList;

public class Zomato {
	ArrayList<Hotel> hotels = new ArrayList<Hotel>();

	public void addhotesl() {
		ArrayList<Dish> menu= new ArrayList<Dish>();
		menu.add(new Dish("Paneer", 100));
		menu.add(new Dish("Chicken-Biryani", 250));
		menu.add(new Dish("Vegetable-Salad", 80));
		menu.add(new Dish("Prawn-Curry", 300));
		menu.add(new Dish("Mango-Lassi", 60));
		menu.add(new Dish("Chocolate-Cake", 150));
		hotels.add(new Hotel("Grand-Hayat", 5, 145150, menu));
		
		ArrayList<Dish> menu1 = new ArrayList<Dish>();
		menu1.add(new Dish("Butter-Chicken", 220));
		menu1.add(new Dish("Fish-Fry", 200));
		menu1.add(new Dish("Greek-Salad", 90));
		menu1.add(new Dish("Lamb-Kebab", 280));
		menu1.add(new Dish("Strawberry-Smoothie", 70));
		menu1.add(new Dish("Vanilla-IceCream", 130));
		hotels.add(new Hotel("The-Oberoi", 4, 125000, menu1));

		ArrayList<Dish> menu2 = new ArrayList<Dish>();
		menu2.add(new Dish("Mutton-Rogan-Josh", 270));
		menu2.add(new Dish("Fried-Rice", 150));
		menu2.add(new Dish("Caesar-Salad", 100));
		menu2.add(new Dish("Grilled-Chicken", 230));
		menu2.add(new Dish("Pineapple-Juice", 50));
		menu2.add(new Dish("Chocolate-Mousse", 140));
		hotels.add(new Hotel("Taj-Palace", 5, 200000, menu2));

		ArrayList<Dish> menu3 = new ArrayList<Dish>();
		menu3.add(new Dish("Paneer-Tikka", 180));
		menu3.add(new Dish("Beef-Steak", 350));
		menu3.add(new Dish("Caprese-Salad", 110));
		menu3.add(new Dish("Pork-Ribs", 320));
		menu3.add(new Dish("Orange-Juice", 55));
		menu3.add(new Dish("Lemon-Tart", 120));
		hotels.add(new Hotel("Marriott", 5, 175000, menu3));

		ArrayList<Dish> menu4 = new ArrayList<Dish>();
		menu4.add(new Dish("Chole-Bhature", 160));
		menu4.add(new Dish("Lobster-Thermidor", 400));
		menu4.add(new Dish("Garden-Salad", 85));
		menu4.add(new Dish("Roast-Duck", 310));
		menu4.add(new Dish("Banana-Shake", 65));
		menu4.add(new Dish("Apple-Pie", 125));
		hotels.add(new Hotel("Hilton", 4, 160000, menu4));

		ArrayList<Dish> menu5 = new ArrayList<Dish>();
		menu5.add(new Dish("Palak-Paneer", 190));
		menu5.add(new Dish("Crab-Cakes", 260));
		menu5.add(new Dish("Waldorf-Salad", 95));
		menu5.add(new Dish("BBQ-Ribs", 290));
		menu5.add(new Dish("Grape-Juice", 60));
		menu5.add(new Dish("Cheesecake", 135));
		hotels.add(new Hotel("Ritz-Carlton", 5, 220000, menu5));

		
		
	}

}
