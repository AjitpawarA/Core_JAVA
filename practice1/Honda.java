package practice1;

public class Honda extends Bike{
	String color;
	int price;
	Honda(){
		System.out.println("This is Honda");
	}
	
	Honda(String color, int price, String company, String country){
		super(company,country);
		this.color=color;
		this.price=price;
	}
	Honda(String color, int price){
		this.color=color; 
		this.price=price;
	}
	public static void main(String[] args) {
		Honda b = new Honda("RED",101,"TATA","IND");
		
		Honda b1 = new Honda("BLUE", 500);

//		System.out.println(b1.color+" "+b1.company+" "+b1.country+" "+b1.price);
		System.out.println(b.color+" "+b.company+" "+b.country+" "+b.price);
		
	}
}
