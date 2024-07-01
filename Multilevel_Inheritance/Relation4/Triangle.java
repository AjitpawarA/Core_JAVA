package Relation4;

public class Triangle extends Shape{
	private double base;
	private double hei;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	Triangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	Triangle(String color, double base, double hei){
		super(color);
		this.base=base;
		this.hei=hei;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", hei=" + hei + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHei() {
		return hei;
	}

	public void setHei(double hei) {
		this.hei = hei;
	}

}
