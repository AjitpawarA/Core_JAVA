package Relation6_Has_a_Person_Adhar;

public class Person {
	private String fname;
	private String lname;
	private String dob;
	
	private Adhar a;

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", a=" + a + "]";
	}

	public Person(String fname, String lname, String dob, Adhar a) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.a = a;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Adhar getA() {
		return a;
	}

	public void setA(Adhar a) {
		this.a = a;
	}
	
	
}
