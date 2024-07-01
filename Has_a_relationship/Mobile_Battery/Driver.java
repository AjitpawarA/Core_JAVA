package Mobile_Battery;

public class Driver {
public static void main(String[] args) {
	Mobile vivo = new Mobile("VIVO",4545,45,new Battery("lithium", 15550));

	System.out.println(vivo);
	vivo.mDetails();
}
}
