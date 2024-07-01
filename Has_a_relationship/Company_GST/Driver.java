package Company_GST;

public class Driver {
	public static void main(String[] args) {
		Company amdocs = new Company("Amdocs", "Azad Punawala" , "Pune", new Gst(121212));
		amdocs.getGST();
		amdocs.gst.showgst();
		}
}
