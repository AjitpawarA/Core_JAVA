package Calci_Using_InerFace;

public class calcliV1Imp extends basicCalciImp implements calciV1  {

	@Override
	public int power(int a, int b) {
		// TODO Auto-generated method stub
		int pow=1;
		for (int i=1; i<=b; i++) {
			pow=pow*a;
		}
		return pow;
	}

}
