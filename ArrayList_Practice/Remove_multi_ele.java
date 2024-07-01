package ArrayList_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_multi_ele {
	
	public static ArrayList<Employe> removemulti(ArrayList<Employe> employees, String key){
		
		ArrayList<Employe> listtoberemoved=new ArrayList<Employe>();
		
		
		for (Employe employe : employees) {
			if(employe.getName().equals(key)) {
				listtoberemoved.add(employe);
			}
		}
		
		return listtoberemoved;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Employe> employes= new ArrayList<Employe>();
		employes.add(new Employe("Ajit", 101, 50000));
		employes.add(new Employe("Nikhil", 102, 5000));
		employes.add(new Employe("Sota", 103, 500));
		employes.add(new Employe("Patil", 1045, 90000));
		employes.add(new Employe("Patil", 1014, 87900));
		employes.add(new Employe("Patil", 1041, 95440));
		employes.add(new Employe("Patil", 1024, 90000));
		employes.add(new Employe("Mane", 105, 9000));
		employes.add(new Employe("Neha", 106, 45000));
		employes.add(new Employe("Neha", 106, 4578000));
		employes.add(new Employe("Neha", 106, 48785000));
		employes.add(new Employe("Neha", 106, 45455000));
		employes.add(new Employe("Amey", 107, 56000));
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("=============Before removal ================");
		for (Employe employe : employes) {
			System.out.println(employe);
		}
		System.out.println(employes.size());
		
		System.out.println("Remove all elements of same name");
		System.out.println("Enter name:");
		String name = sc.next();
		
		
//		System.out.println(removemulti(employes, name));
		
		employes.removeAll(removemulti(employes, name));
		System.out.println("=============After removal ================");
		for (Employe employe : employes) {
			System.out.println(employe);
		}
		System.out.println(employes.size());
		
		
	}
}
