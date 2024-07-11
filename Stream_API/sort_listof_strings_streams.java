package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sort_listof_strings_streams {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Banana");
		stringList.add("Apple");
		stringList.add("Orange");
		stringList.add("Mango");
		stringList.add("Grapes");

		List<String> ascendingOrderList = stringList.stream().sorted().collect(Collectors.toList());
		System.out.println("Asc:"+ascendingOrderList);
		List<String> descendingOrderList = stringList.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("Desc:"+ascendingOrderList);
		
		
		List<Integer> nums = Arrays.asList(10, 20, 30, 5, 25, 15, 40);
		Optional<Integer> maxnum =nums.stream().max((o1,o2)-> o1-o2);
		System.out.println(maxnum.get());
		
		Optional<Integer> minnum =nums.stream().min((o1,o2)-> o1-o2);
		System.out.println(minnum.get());
		
		
		Stream<Integer> s= nums.stream();
		List<Integer> numbers=s.sorted().collect(Collectors.toList());
		System.out.println("Second smallest : "+ numbers.get(1));
		System.out.println("Second largest : "+ numbers.get(nums.size()-2));
		
		
		
	}
}
