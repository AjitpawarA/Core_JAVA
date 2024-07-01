package WrapperClass;

public class WrapperClasses {
public static void main(String[] args) {
	int a =10;
	
	
	//boxing
	Integer i=Integer.valueOf("10");
	Integer z=Integer.valueOf(a);

	//unboxing 
	
	int x =i.intValue();
	System.out.println(x);
	
	//boxing using constructor
	Integer integer = new Integer(a);
	System.out.println(integer);
	
	int temp =20;
	//autpboxing
	Integer j =x;
	//autounboxing
	int g=j;
}
}
