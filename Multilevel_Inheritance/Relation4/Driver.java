package Relation4;

public class Driver {
	public static void main(String[] args) {
		Shape s= new Shape("red");
		System.out.println(s.getColor());
		System.out.println(s.area(10.2,50.4));
		System.out.println("-----------------------------");
		
		
		Triangle t = new Triangle("blue",4.30,5.20);
		System.out.println("area of "+t.getColor()+" triangle: "+t.area(t.getBase(), t.getHei()));
		
		
		System.out.println("------------------------------");
		
		Equi_Triangle e1 = new Equi_Triangle("Black",14);
		System.out.println("area of height"+e1.getHei()+"and base "+e1.getBase()+" is :"+e1.getArea());
		System.out.println("perimetr of "+e1.getColor()+" triangle is"+e1.calperimeter(e1.getSidel()));
	}
}
