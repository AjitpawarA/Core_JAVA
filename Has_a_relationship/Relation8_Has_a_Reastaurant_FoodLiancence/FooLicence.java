package Relation8_Has_a_Reastaurant_FoodLiancence;

public class FooLicence {
	private int L_no;

	public int getL_no() {
		return L_no;
	}

	public void setL_no(int l_no) {
		L_no = l_no;
	}

	public FooLicence(int l_no) {
		super();
		L_no = l_no;
	}

	@Override
	public String toString() {
		return "FooLicence [L_no=" + L_no + "]";
	}
	
}
