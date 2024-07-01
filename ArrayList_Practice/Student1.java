package ArrayList_Practice;

import java.util.ArrayList;

public class Student1 {
	String name;
	int age;
	String place;
	int marks;
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", place=" + place + ", marks=" + marks + "]";
	}
	public Student1(String name, int age, String place, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.place = place;
		this.marks = marks;
	}
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}
