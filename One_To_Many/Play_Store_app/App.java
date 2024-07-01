package Play_Store_app;

public class App {
	private String name;
	private int size;
	private int version;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public App(String name, int size, int version) {
		super();
		this.name = name;
		this.size = size;
		this.version = version;
	}
	@Override
	public String toString() {
		return "App [name=" + name + ", size=" + size + ", version=" + version + "]";
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	
}
