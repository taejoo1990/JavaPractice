package Interfaceex;

public class CalcMain {

	public static void main(String[] args) {

		int num1=10;
		int num2=5;
		
		
	
		
		Calc c1=new CompleteCalc();//UP ĳ���� ����
		//c1���� showInfo�� �����Ҽ����� : �θ�Ŭ�������� 
		//��Ӱ��迩�� �ڽ�Ŭ�������� ���� �����Ȱ��� �����Ҽ� ����
		Calc c2=new CompleteCalc();
		System.out.println("==Default Method==");
		c2.description();//����Ʈ
		System.out.println();
		
		System.out.println("==Static Method==");
		int[] arr ={1,2,3,4,5};
		System.out.println("1~5������ �� : "+Calc.total(arr));
		
		System.out.println("==interface Method==");
		
		CompleteCalc calc=new CompleteCalc();
		calc.showInfo();
				
		
		System.out.println("num1 + num2 ="+c1.add(num1, num2));//Calculator�� Override�� �޼��鸦 �����Ѱ�
		System.out.println("num1 - num2 ="+c1.substract(num1, num2));//Calculator�� Override�� �޼��鸦 �����Ѱ�
		System.out.println("num1 * num2 ="+c1.times(num1, num2));//CompleteCalc�� Override�� �޼��鸦 �����Ѱ�
		System.out.println("num1 / num2 ="+c1.divide(num1, num2));//CompleteCalc�� Override�� �޼��鸦 �����Ѱ�
		
	}

}
