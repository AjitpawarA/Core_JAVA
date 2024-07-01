package anonymous;


public class Anonynomus_classes {
public static void main(String[] args) {
	Student s1 = new Student("Rohit");
	s1.study();
	
	
	Student s2 = new Student("Ajit") {
		public void study() {
			System.out.println(name+" studies 200 hrs");
		}
	};
	
	s2.study();
}
}
