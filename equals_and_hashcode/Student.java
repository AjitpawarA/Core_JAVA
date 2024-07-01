package equals_and_hashcode;
public class Student {
	String name;
	int id;
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.name.equals(s.name);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
}
