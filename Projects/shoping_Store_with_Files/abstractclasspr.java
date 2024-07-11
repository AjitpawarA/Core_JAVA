package shoping_Store_with_Files;

abstract public class abstractclasspr {
	abstract public void print();
	
	public void add() {
		
	}
	
	int a=10;
	static int b =10;
	
	final int c=20;
	
	
	public static void main(String[] args) {
		abstractclasspr cpr = new abstractclasspr() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		cpr.add();
		cpr.print();
		
		System.out.println(cpr.a);
		System.out.println(b);
		System.out.println(cpr.c);
	}
}
