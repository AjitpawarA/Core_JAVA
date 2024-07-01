package Relation4;

public class Equi_Triangle extends Triangle{
	
	
	Equi_Triangle(String color) {
		super(color);
	}
	
	Equi_Triangle(){
		
	}

	public double getSidel() {
		return sidel;
	}

	public void setSidel(double sidel) {
		this.sidel = sidel;
	}

	private double sidel;
	
	public Equi_Triangle(double sidel) {
		this.sidel=sidel;
		super.setBase(sidel);
		super.setHei(sidel);
	}
	
	public Equi_Triangle(String color,double sidel) {
		this.sidel=sidel;
		super.setBase(sidel);
		super.setHei(sidel);
		super.setColor(color);
	}
	
	public double calperimeter(double sidel) {
		return sidel*3;
	}
}
