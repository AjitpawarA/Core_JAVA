package ArrayList_Practice;

import java.util.ArrayList;

public class add_All_method_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> northmenu= new ArrayList<String>();
		
		northmenu.add("Roti");
		northmenu.add("PaneerMasala");
		northmenu.add("panipuri");
		
		
		ArrayList<String> southmenu = new ArrayList<String>();
		
		southmenu.add("Eidli");
		southmenu.add("Doas");
		southmenu.add("wada");
		
		
		ArrayList<String> indianmenu = new ArrayList<String>();
		
		indianmenu.addAll(southmenu);
		indianmenu.addAll(northmenu);
		
		
		System.out.println("SOUTH: "+southmenu);
		System.out.println("NORTH: "+northmenu);
		System.out.println("INDIAN: "+indianmenu);
	}
}
