package Mobile_Battery;

public class Battery {
	private String type;
	private int Battery_capcity;
	public Battery(String type, int battery_capcity) {
		super();
		this.type = type;
		Battery_capcity = battery_capcity;
	}
	@Override
	public String toString() {
		return "Battery [type=" + type + ", Battery_capcity=" + Battery_capcity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBattery_capcity() {
		return Battery_capcity;
	}
	public void setBattery_capcity(int battery_capcity) {
		Battery_capcity = battery_capcity;
	}
	
	
}
