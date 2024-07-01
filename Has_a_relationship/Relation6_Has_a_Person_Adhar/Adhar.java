package Relation6_Has_a_Person_Adhar;

public class Adhar {
	private long adharno;
	private String address;
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Adhar(long adharno, String address) {
		super();
		this.adharno = adharno;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Adhar [adharno=" + adharno + ", address=" + address + "]";
	}
	
	
}
