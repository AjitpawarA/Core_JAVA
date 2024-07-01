package Relation5_Has_a_Bike_Engine;

public class Bike {
	private int year;
	private String model;
	
	private Enigne e;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Enigne getE() {
		return e;
	}

	public void setE(Enigne e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Bike [year=" + year + ", model=" + model + ", e=" + e + "]";
	}

	public Bike(int year, String model, Enigne e) {
		super();
		this.year = year;
		this.model = model;
		this.e = e;
	}
	
	
	
}
