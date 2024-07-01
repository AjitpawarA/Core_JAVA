package Higher_order_function;

import java.util.Arrays;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		HigherOrderFunction h = new HigherOrderFunction();
		h.print(10, 20, new Adder_implementation());
		
		List l = Arrays.asList(10,203,45);
		l.forEach((n) -> System.out.println((int)n/2));
	}
}
