package Comprator;

import java.util.Comparator;

public class Compareprice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Book p1 = (Book)o1;
		Book p2 = (Book)o2;

		if(p1.price==p2.price) {
			return 0;
		}
		else if(p1.price>p2.price) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
