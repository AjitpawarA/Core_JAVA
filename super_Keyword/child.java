package super_Keyword;

public class child extends Super_Keyword{
		int num =200;
		
		void display() {
			System.out.println(super.num);   // will print from parent class
			System.out.println(this.num);    // will print fro child itself
			System.out.println(num);         // will print from child itself
		}
		
		public static void main(String[] args) {
			child c = new child();
			c.display();
			
		}
}
