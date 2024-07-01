package Calci_Using_InerFace;

public class calciV2Imp extends basicCalciImp implements calciv2{

	@Override
	public int square(int a) {
		return a*a;
	}

	@Override
	public int cube(int a) {
		return a*a*a;
	}

}
