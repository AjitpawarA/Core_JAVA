package Library_ArrayList;

import java.util.Comparator;

public class sortByPrice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		if(b1.getPrice()==b2.getPrice()) {
			return 0;
		}
		else if(b1.getPrice()>b2.getPrice()) {
			return 1;
			
		}
		else {
			return -1;
		}
	}

}
