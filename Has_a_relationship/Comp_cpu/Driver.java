package Comp_cpu;

public class Driver {
	public static void main(String[] args) {
		Computer hp = new Computer("HP", 10000, new Cpu("corei5", 15150));
		System.out.println(hp);
		hp.cpu.displaycpu();
	
	}
}
