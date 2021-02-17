package pk12;

public interface Calc {
//인터페이스로 들어갈시 파이널 표시를 안해도 파이널 고정값
	
	//hip mamory
	//public static final double PI=3.14;//public static final : interface에서 필드 선어시 상수로 정의됨
	double PI=3.14;//public static final 생략가능
	int ERROE=99999999;
	
	//public abstract int add (int num1, int num2);
	int add (int num1, int num2);//public abstract 생략
	int substract (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);
	
	
	
}
