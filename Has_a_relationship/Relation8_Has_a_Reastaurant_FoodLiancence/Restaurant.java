package Relation8_Has_a_Reastaurant_FoodLiancence;

public class Restaurant {
	private String R_name;
	private String loc;
	
	FooLicence lic ;
	
	public String getR_name() {
		return R_name;
	}
	public void setR_name(String r_name) {
		R_name = r_name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Restaurant [R_name=" + R_name + ", loc=" + loc + "Lic:"+lic+ "]";
	}
	public Restaurant(String r_name, String loc, FooLicence lic) {
		super();
		R_name = r_name;
		this.loc = loc;
		this.lic=lic;
	}
	
}
