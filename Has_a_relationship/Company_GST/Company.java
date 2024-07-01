package Company_GST;

public class Company {
	private String name;
	private String ceoname;
	private String loc;
	
	Gst gst;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCeoname() {
		return ceoname;
	}
	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", ceoname=" + ceoname + ", loc=" + loc + "GST:"+gst+ "]";
	}
	public Company(String name, String ceoname, String loc, Gst gst) {
		super();
		this.name = name;
		this.ceoname = ceoname;
		this.loc = loc;
		this.gst=gst;
	}
	
	public void getGST() {
		System.out.println(gst);
	}
	
	
}
