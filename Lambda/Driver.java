package Lambda;

public class Driver {
	public static void main(String[] args) {
		
		
		//lambda expression
		Interface1 a =()->{
			System.out.println("Hello");
			System.out.println("Welcome");
		};
		a.run();
		
		
		
		//lambda with multiline expressions
		Interface2 b = (x,y,z)->{
			System.out.println("Addition in :"+(x+y+z));
			System.out.println("how are u?");
		};
		b.performaddition(1,20,30);
		
		
		
		//single line lambda function
		Interface2 c= (x,y,z)->	System.out.println("Addition in :"+(x+y+z));
		b.performaddition(1,20,50);
		
		
		
		// lambda with return statement 
		Interface3 d  = (x,y)->{
			return x+y;
		};
		System.out.println(d.sum(10, 200));
	}
}
