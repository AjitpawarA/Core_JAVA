package ArrayList_Practice;

public class Employe {
	private String name;
	private int id;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employe(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		Employe e = (Employe)obj;
//		if(e.getName()==this.getName()) {
//			return true;
//		}
//		return false;
//	}
	
	
	
	
	
}
