package Interfaceex;

//추상메서드를 모두 구현했으므로 일반 클래스
public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
	//일반 메서드
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
