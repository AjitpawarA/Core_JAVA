package Play_Store_app;

import java.util.ArrayList;

public class Play_store {
	ArrayList<App> apps = new ArrayList<App>();
	
	public void adddefaultapps() {

apps.add(new App("WhatsApp", 100, 3));
apps.add(new App("Instagram", 200, 5));
apps.add(new App("Facebook", 150, 7));
apps.add(new App("Snapchat", 120, 4));
apps.add(new App("Twitter", 180, 6));
	}
	
}
