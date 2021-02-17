package pk02;

public class LogicTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//short circuit evalution(단항 회로 평가) sce
		
		int num1=10;
		int i=2;
		
		boolean value=((num1=num1+10) < 10) && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		value=((num1=num1+10) > 10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		
	}

}
