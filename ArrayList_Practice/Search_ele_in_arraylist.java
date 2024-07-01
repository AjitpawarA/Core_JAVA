package ArrayList_Practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Search_ele_in_arraylist {
	
	public static Employe searchbyid(ArrayList<Employe> employes, int id) {
	    for (Object emp : employes) {
	        Employe e = (Employe) emp;
	        if (e.getId() == id) {
	            return e;
	        }
	    }
	    return null;
	}
	
	
	public static Employe searchempbyid(ArrayList<Employe> employes, int id) {
		Iterator i = employes.iterator();
		while(i.hasNext()) {
			Employe e = (Employe)i.next();
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		ArrayList<Employe> employes= new ArrayList<Employe>();
		employes.add(new Employe("Ajit", 101, 50000));
		employes.add(new Employe("Nikhil", 102, 5000));
		employes.add(new Employe("Sota", 103, 500));
		employes.add(new Employe("Patil", 104, 90000));
		employes.add(new Employe("Mane", 105, 9000));
		employes.add(new Employe("Neha", 106, 45000));
		employes.add(new Employe("Amey", 107, 56000));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Search employee by its id:");
		System.out.println("Enter id:");
		int id = sc.nextInt();
		
		Employe e=searchbyid(employes, id);
		if(e!=null) {
			System.out.println("Employee found ...");
			System.out.println(e);
		}
		else {
			System.out.println("Employee not found");
		}
		
		Employe e1=searchempbyid(employes, id);
		if(e1!=null) {
			System.out.println("Employee found ...");
			System.out.println(e1);
		}
		else {
			System.out.println("Employee not found");
		}
	}
}
