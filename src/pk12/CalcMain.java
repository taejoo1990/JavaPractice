package pk12;

public class CalcMain {

	public static void main(String[] args) {

		int num1=10;
		int num2=5;
		
		
		CompleteCalc calc=new CompleteCalc();
		calc.showInfo();
		
		
		Calc c1=new CompleteCalc();//UP ĳ���� ����
		//c1���� showInfo�� �����Ҽ����� : �θ�Ŭ�������� 
		//��Ӱ��迩�� �ڽ�Ŭ�������� ���� �����Ȱ��� �����Ҽ� ����
		System.out.println("num1 + num2 ="+c1.add(num1, num2));//Calculator�� Override�� �޼��鸦 �����Ѱ�
		System.out.println("num1 - num2 ="+c1.substract(num1, num2));//Calculator�� Override�� �޼��鸦 �����Ѱ�
		System.out.println("num1 * num2 ="+c1.times(num1, num2));//CompleteCalc�� Override�� �޼��鸦 �����Ѱ�
		System.out.println("num1 / num2 ="+c1.divide(num1, num2));//CompleteCalc�� Override�� �޼��鸦 �����Ѱ�
		
	}

}
