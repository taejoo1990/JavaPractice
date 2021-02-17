package pk12;

public class CalcMain {

	public static void main(String[] args) {

		int num1=10;
		int num2=5;
		
		
		CompleteCalc calc=new CompleteCalc();
		calc.showInfo();
		
		
		Calc c1=new CompleteCalc();//UP 캐스팅 복습
		//c1에서 showInfo를 참조할수없음 : 부모클래스에서 
		//상속관계여도 자식클래스에서 새로 구현된것은 참조할수 없음
		System.out.println("num1 + num2 ="+c1.add(num1, num2));//Calculator의 Override된 메서들를 실행한것
		System.out.println("num1 - num2 ="+c1.substract(num1, num2));//Calculator의 Override된 메서들를 실행한것
		System.out.println("num1 * num2 ="+c1.times(num1, num2));//CompleteCalc의 Override된 메서들를 실행한것
		System.out.println("num1 / num2 ="+c1.divide(num1, num2));//CompleteCalc의 Override된 메서들를 실행한것
		
	}

}
