package State_CM;

public class Cm {
	private String cmname;
	private int experience;
	
	@Override
	public String toString() {
		return "Cm [cmname=" + cmname + ", experience=" + experience + "]";
	}
	public Cm(String cmname, int experience) {
		super();
		this.cmname = cmname;
		this.experience = experience;
	}
	public String getCmname() {
		return cmname;
	}
	public void setCmname(String cmname) {
		this.cmname = cmname;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void cmdetails() {
		System.out.println("CM name:" +cmname+" Exp: "+experience);
	}
	
}
