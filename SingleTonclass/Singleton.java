package SingleTonclass;

public class Singleton {
	
	static Singleton singleton;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getinstance() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
	
	public void print() {
		System.out.println("this is single ton class method");
	}
}
