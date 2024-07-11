package Stream_API;
import java.util.Arrays;
import java.util.List;

public class practice3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amey", "ajit", "Nikhil", "neha", "Sandep");

		long count = names.stream().filter(name -> name.toLowerCase().startsWith("a")).count();
		System.out.println(count);
	}
}
