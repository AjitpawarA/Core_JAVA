package ArrayList_Practice;

import java.util.ArrayList;

public class get_methd_Arraylist {
		public static void main(String[] args) {
			ArrayList nums = new ArrayList();
			
			nums.add(10);
			nums.add(20);
			nums.add(40);
			nums.add(200);
			
			System.out.println("at i=2: "+nums.get(2));
			System.out.println("at i=1: "+nums.get(1));
			 
			
			//for loop 
			System.out.println("Array traverse using for loop");
			for(int i=0; i<nums.size(); i++) {
				System.out.print(nums.get(i)+" ");
			}
			System.out.println();
			
			
			
			System.out.println("sum of array elements:");
			int sum=0;
			
			for(int i=0; i<nums.size(); i++) {
				sum = sum + (int)nums.get(i);   //have to perform typecasting beacause arraylist store elements in object type
			}
			System.out.println(sum);
			
		}
}
