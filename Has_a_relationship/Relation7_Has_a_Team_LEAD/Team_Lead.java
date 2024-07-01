package Relation7_Has_a_Team_LEAD;

public class Team_Lead {
	String tlname;
	int empid;
	
	public void tl_details() {
		System.out.println("TL_name: "+tlname+ " TL_empID: "+ empid);
	}

	public Team_Lead(String tlname, int empid) {
		super();
		this.tlname = tlname;
		this.empid = empid;
	}
}
