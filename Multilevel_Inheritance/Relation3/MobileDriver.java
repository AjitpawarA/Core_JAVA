package Relation3;

public class MobileDriver {
	public static void main(String[] args) {
		Electronic_device e1 = new Electronic_device("VIVO", 10000);
		System.out.println(e1);
		e1.poweron();
		
		System.out.println("-----------------------------------");
		
		
		MobilePhone m1 =new MobilePhone("OPPO", 50000, "JIO");
		System.out.println(m1);
		m1.poweron();
		m1.makeCall();
		
		System.out.println("-----------------------------------");
		
		
		Iphone i1 = new Iphone("Iphone 16", 70000, "Airtel", "v16");
		System.out.println(e1);
		i1.poweron();
		i1.dynamicIsland();
		i1.makeCall();
		
		System.out.println("-----------------------------------");
		
		
		
		MobilePhone m2 = new Iphone("Iphone 14", 80000, "BSNL", "v14");
		System.out.println(m2);
		m2.poweron();
		m2.makeCall();
		Iphone im2 = (Iphone)m2;
		im2.dynamicIsland();
		
		System.out.println("-----------------------------------");
		
		
		Electronic_device e2 = new Iphone("Iphone 17", 45450, "Vodphone", "v17");
		System.out.println(e2);
		e2.poweron();
		Iphone ie2= (Iphone)e2;
		ie2.dynamicIsland();
		ie2.makeCall();
		
		System.out.println("-----------------------------------");
		
		
		Electronic_device e3 = new MobilePhone("MI", 150000, "Idea");
		MobilePhone ie3 = (MobilePhone)e3;
		ie3.poweron();
		ie3.makeCall();
	}
}
