
package Relation6_Has_a_Person_Adhar;

public class Driver {
	public static void main(String[] args) {
		Person p1= new Person("Ajit", "Pawar", "18-07-2002", new Adhar(1212121,"Vita-Sangli"));
		System.out.println(p1);
	
		Adhar a = new Adhar(1212121,"Vita-Sangli");
		System.out.println(a);
	}
}