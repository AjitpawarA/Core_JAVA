package Relation7_Has_a_Team_LEAD;

public class Driver {
public static void main(String[] args) {
	
	Team_Lead tl = new Team_Lead("Mr.Vinod",112);
	Team alpha = new Team("Alpha", 10, "FireFlink", tl);
	
	System.out.println(alpha);
	alpha.getTl().tl_details();
}
}
