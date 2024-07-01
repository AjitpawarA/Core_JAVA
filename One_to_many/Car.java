package One_to_many;

public class Car {
	String ccomp;
	int age;
	
	Tyre[] t = new Tyre[4];
	
	int i =0;
	
	void addtyre(Tyre t) {
		this.t[i++]=t;
	}
	
	void getcar() {
		System.out.println("Car Company : "+ ccomp); 
	}
	
	Car(String ccomp, int age){
		this.ccomp=ccomp;
		this.age = age;
	}
	public void gettyre() {
		for(int i=0; i<t.length; i++) {
			System.out.println( "T-comp: "+t[i].tcomp+ "T-rad: " +t[i].trad);
		}
	}
}
