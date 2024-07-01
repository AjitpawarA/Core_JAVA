package Relation5_Has_a_Bike_Engine;

public class Enigne {
	private String engineType;
	private int topspeed;
	
	public Enigne(String engineType, int topspeed) {
		super();
		this.engineType = engineType;
		this.topspeed = topspeed;
	}
	@Override
	public String toString() {
		return "Enigne [engineType=" + engineType + ", topspeed=" + topspeed + "]";
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getTopspeed() {
		return topspeed;
	}
	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	
}
