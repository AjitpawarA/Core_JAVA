package shoping_Store_with_Files;

public class demo {

	int age;
	int num;
	int marks;
	int id;

	demo() {

	}

	demo(int age) {
		this.age = age;
	}

	demo(int age, int num) {
		this(age);
		this.num = num;
	}

	demo(int age, int marks, int num) {
		this(age, num);
		this.marks = marks;
	}

	demo(int age, int num, int marks, int id) {
		this(age, num, marks);
		this.id = id;
	}

	public static void main(String[] args) {

		demo d = new demo();
		System.out.println(d.age);
		System.out.println(d.id);
		System.out.println(d.marks);
		System.out.println(d.num);

		System.out.println("............................");

		demo d1 = new demo(10);
		System.out.println(d1.age);
		System.out.println(d1.id);
		System.out.println(d1.marks);
		System.out.println(d1.num);

		System.out.println("............................");

		demo d2 = new demo(10, 20);
		System.out.println(d2.age);
		System.out.println(d2.id);
		System.out.println(d2.marks);
		System.out.println(d2.num);

		System.out.println("............................");

		demo d3 = new demo(10, 20, 30);
		System.out.println(d3.age);
		System.out.println(d3.id);
		System.out.println(d3.marks);
		System.out.println(d3.num);
		System.out.println("............................");

		demo d4 = new demo(10, 20, 30,40);
		System.out.println(d4.age);
		System.out.println(d4.id);
		System.out.println(d4.marks);
		System.out.println(d4.num);

	}
}