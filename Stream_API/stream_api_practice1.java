package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_api_practice1 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 47, 31, 50);

		Stream<Integer> s1 = list.stream();

		s1.forEach((n) -> System.out.println(n));
		System.out.println("------------");

		Stream<Integer> s2 = list.stream();

		Stream<Integer> s3 = s2.filter((n) -> ((int) n) % 2 == 0);

		s3.forEach((n) -> System.out.println(n));
		System.out.println("-------------");
		list.stream().map((n) -> {
			int x = (int) n;
			if (!(x % 2 == 0)) {
				return 0;
			}
			return n;
		}).forEach((n) -> System.out.println(n));
		
		ArrayList s = (ArrayList) list.stream().map((n)-> ((int)n)*10).collect(Collectors.toList());
		System.out.println(s);
		
		long l = list.stream().count();
		System.out.println(l);
		
		System.out.println("---");
		
		List list1 = Arrays.asList(1,11,1,1,1,2,5,7);
		list1.stream().distinct().forEach((n)->System.out.println(n));
		
		System.out.println();
		
		Optional<Integer> opt = list.stream().findFirst();
		System.out.println(opt.get());
		
		Optional<Integer> opt1= list.stream().max((o1,o2)->o2-o1);
		System.out.println(opt1.get());
		
		Optional<Integer> opt2= list.stream().min((o1,o2)->o2-o1);
		System.out.println(opt2.get());
		
		
	}
}
