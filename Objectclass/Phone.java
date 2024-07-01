package Objectclass;

public class Phone {
	int ram;
	int rom;
	
	Phone(int ram, int rom){
		this.ram=ram;
		this.rom=rom;
	}
	public String toString() {
		return "Ram: "+ram+" Rom: "+rom;
	}
}
