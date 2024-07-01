package Play_Store_app;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Play_store miplay= new Play_store();
		miplay.adddefaultapps();
		
		boolean exit =true;
		
		while(exit) {
			
			System.out.println("choose correct option");
			System.out.println("1:Install app");
			System.out.println("2:uninstall app");
			System.out.println("3: show all apps");
			System.out.println("0:exit");
			int choise = sc.nextInt();
			
			switch(choise) {
			case 1:{
				System.out.println("enter app name:");
				String appname = sc.next();
				boolean match = false;
				for (App app : miplay.apps) {
					if(app.getName().equals(appname)) {
						System.out.println("App already exist");
						match=true;
					}
				}
				
				if(match==false) {
					System.out.println("Enter version for your app");
					int ver = sc.nextInt();
					System.out.println("enter size :");
					int si= sc.nextInt();
					miplay.apps.add(new App(appname,ver,si));
					System.out.println("App installed in play store");
				}
				
			}
			break;
			case 2:{
				System.out.println("Enter app name to uninstall...");
				String appname=sc.next();
				boolean match=false;
				App toberemoved = null;
				for (App app : miplay.apps) {
					if(app.getName().equals(appname)) {
						match=true;
						toberemoved=app;
					}
				}
				if(toberemoved!=null) {
					miplay.apps.remove(toberemoved);
				}
			}
			break;
			case 3:{
				System.out.println("All apps");
				for (App app : miplay.apps) {
					System.out.println("App :"+ app.getName());
				}
			}
			break;
			case 0:{
				exit = false;
			}
			break;
			default:{
				System.out.println("Wrong choise");
			}
			}
			
		}
	}
}
