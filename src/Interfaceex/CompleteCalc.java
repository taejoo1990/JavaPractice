package Interfaceex;

//�߻�޼��带 ��� ���������Ƿ� �Ϲ� Ŭ����
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
	
	//�Ϲ� �޼���
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

}
