package SingleTonclass;

public class Driver {
	public static void main(String[] args) {

		Singleton s2 = Singleton.getinstance();

		s2.print();
		Singleton s1 = Singleton.getinstance();

		s1.print();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()==s2.hashCode());
	}
}
