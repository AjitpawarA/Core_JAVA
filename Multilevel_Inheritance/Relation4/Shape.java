package Relation4;

public class Shape {
	
	private String color;
	private double area;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	} 
	
	Shape(String color){
		this.color=color;
	}
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", area=" + area + ", getColor()=" + getColor() + ", getArea()=" + getArea()
				+ "]";
	}
	public double area(double base, double hei) {
		return (base*hei)/2;
	}
}
