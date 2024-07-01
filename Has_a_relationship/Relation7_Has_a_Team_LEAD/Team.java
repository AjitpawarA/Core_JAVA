package Relation7_Has_a_Team_LEAD;

public class Team {
	private String teamname;
	private int num_of_members;
	private String projectname;
	
	private Team_Lead tl ;

	public Team(String teamname, int num_of_members, String projectname, Team_Lead tl) {
		super();
		this.teamname = teamname;
		this.num_of_members = num_of_members;
		this.projectname = projectname;
		this.tl = tl;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public int getNum_of_members() {
		return num_of_members;
	}

	public void setNum_of_members(int num_of_members) {
		this.num_of_members = num_of_members;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public Team_Lead getTl() {
		return tl;
	}

	public void setTl(Team_Lead tl) {
		this.tl = tl;
	}

	@Override
	public String toString() {
		return "Team [teamname=" + teamname + ", num_of_members=" + num_of_members + ", projectname=" + projectname
				;
	}
}
