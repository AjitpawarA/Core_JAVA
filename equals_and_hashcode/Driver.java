package equals_and_hashcode;

public class Driver {
public static void main(String[] args) {
	Student s1 = new Student("Ajit", 10);
	Student s2 =  new Student("Ajit", 10);

	System.out.println(s1.equals(s2));
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
}
}
