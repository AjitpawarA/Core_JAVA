package ArrayList_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class remove_ele_arraylist_iterator {
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
		
		
		System.out.println("=============Before removal ================");
		for (Employe employe : employes) {
			System.out.println(employe);
		}
		System.out.println(employes.size());
		
		System.out.println("Remove element by name");
		System.out.println("Enter name:");
		String name = sc.next();
		
		
		
		
		Iterator i = employes.iterator();
		Employe toberemoved=null;
		while(i.hasNext()) {
			Employe s = (Employe)i.next();
			if(s.getName().equals(name)) {
				toberemoved=s;
			}
		}
		if(toberemoved!=null){
			employes.remove(toberemoved);
		}
		else {
			System.out.println("Employee not forund");
		}
		
		System.out.println("==============After removal===========");
		
		for (Employe employe : employes) {
			System.out.println(employe);
		}
		System.out.println(employes.size());
		
		
	}
}
