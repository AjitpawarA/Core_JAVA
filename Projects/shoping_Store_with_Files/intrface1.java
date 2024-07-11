package shoping_Store_with_Files;

public interface intrface1 {

	int a = 10;

	static final int b = 20;

	static int c = 40;

	void print();

	static void show() {

	}

	default void add() {

	}

	abstract void sub(int a, int b);

	public static void main(String[] args) {
		intrface1.show();
		intrface1 i1 = new intrface1() {

			@Override
			public void sub(int a, int b) {
				// TODO Auto-generated method stub

			}

			@Override
			public void print() {
				// TODO Auto-generated method stub

			}
		};

		i1.add();
		i1.print();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println(i1.a);
		System.out.println(i1.b);
		System.out.println(i1.c);

		System.out.println(intrface1.a);
		System.out.println(intrface1.b);
		System.out.println(intrface1.c);
	}
}
