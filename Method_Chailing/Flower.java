package Method_Chailing;

public class Flower {
	private String name;
	private String gcolor;
	private int price;
	
	public Flower getName() {
	System.out.println(name);
    return this;
	}
	public Flower setName(String name) {
		this.name = name;
		return this;
		
	}
	public Flower getGcolor() {
		System.out.println(gcolor);
        return this;
	}
	public Flower setGcolor(String gcolor) {
		this.gcolor = gcolor;
		return this;
	}
	public Flower getPrice() {
		System.out.println(gcolor);
        return this;
	}
	public Flower setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public static void main(String[] args) {
		Flower rose= new Flower();

		rose.setName("ROSE").setGcolor("RED").setPrice(10).getGcolor().getName().getPrice();
		
//		System.out.println(rose.getName());
		
	}
	
}
