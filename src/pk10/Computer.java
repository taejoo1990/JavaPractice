package pk10;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println();
		System.out.print("Computer ��ü�� areaCircle() ���� : ");
		//System.out.println("Math.PI : "+Math.PI);
		return Math.PI*r*r;
	}
	

}
