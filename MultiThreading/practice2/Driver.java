package practice2;

public class Driver {
	public static void main(String[] args) {
		subprocess2 s2 = new subprocess2();
		Subprocess1 s1 = new Subprocess1();
		subprocess3 s3 = new subprocess3();
		
		
		s1.start();
		s2.start();
		s3.start();
	}
}
