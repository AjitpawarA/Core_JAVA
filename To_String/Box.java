package To_String;

public class Box {
	int price;
	int size;
	
	public Box(int price, int size) {
		super();
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Box [price=" + price + ", size=" + size + "]";
	}
	
	public boolean equals(Object o) {
		Box b = (Box)o;
		return b.price==this.price;
		
	}
	
	public static void main(String[] args) {
		Box b = new Box(10,20);
		Box c = new Box(30,40);
		
		System.out.println(b.equals(c));
	}
	
}
