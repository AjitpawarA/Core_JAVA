package State_CM;

public class Driver {
	public static void main(String[] args) {
		State maha = new State("Maharashtra", 100000, new Cm("Thakre",5));
		System.out.println(maha);
		maha.getCm().cmdetails();
	}
}
