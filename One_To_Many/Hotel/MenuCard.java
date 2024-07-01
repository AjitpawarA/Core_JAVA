package Hotel;

import java.util.ArrayList;

public class MenuCard {
	ArrayList<Dish> northindian = new ArrayList<Dish>();
	ArrayList<Dish> southindian = new ArrayList<Dish>();
	public void addnorthmenu() {
		northindian.add(new Dish("Paneer", 100));
		northindian.add(new Dish("Kajumala", 170));
		northindian.add(new Dish("Paneer-tikka", 900));
		northindian.add(new Dish("Chole", 70));
		northindian.add(new Dish("Puri-bhaji", 1400));
		northindian.add(new Dish("pav-bhaji", 1040));
		northindian.add(new Dish("puran-poli", 1050));
		northindian.add(new Dish("naan", 10));
		
	}
	public void addsouthmenu() {
		southindian.add(new Dish("Doas",500));
		southindian.add(new Dish("Idli",5100));
		southindian.add(new Dish("Rasam",50));
		southindian.add(new Dish("Sambar",800));
		southindian.add(new Dish("Wada",580));
		southindian.add(new Dish("Bhat",400));
		southindian.add(new Dish("Dal",60));
	}
	
	
}
