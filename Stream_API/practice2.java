package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice2 {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(-1, -1, 0, 27, 28, 6, -6, 4, 2);
	        
	        List<Integer> p_evennos = numbers.stream().filter((n) -> (n > 0) && (n % 2 == 0)).distinct() .collect(Collectors.toList());

	        System.out.println(p_evennos);
	}
}
