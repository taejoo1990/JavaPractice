package Interfaceex;

import pk08.StaticTest;

public interface Calc {
//인터페이스로 들어갈시 파이널 표시를 안해도 파이널 고정값
	
	//hip mamory
	//public static final double PI=3.14;//public static final : interface에서 필드 선어시 상수로 정의됨
	double PI=3.14;//public static final 생략가능
	int ERROE=99999999;
	
	//public abstract int add (int num1, int num2);
	//추상 메서드
	int add (int num1, int num2);//public abstract 생략
	int substract (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);
	
	//디폴트 메서드
	default void description() {
		System.out.println("정수를 계산합니다.");
		
	}
	
	static int total(int [] arr) {
		int total=0;
		
		for(int i:arr) {
			total +=i;
			
		}
		return total;
		
		/*//private method는 내부에서 사용 가능하므로 Override 불가능
		private void myMethod() {
			System.out.println("private 메서드 입니다.");
		}V13버전
		private static void myStaticmyMethod() {
			System.out.println("private static 메서드 입니다.");
		}*/
		
		
	}
	

	
}


/*
1.추상 메서드 : 구현부가 없는 메서드 즉 body{}가 없음 =>추상 클래스
------자바 8부터 제공------
2.디폴트 메서드 : 기본 구성을 가지는 메서드, Override이 됨 즉 구현클래스에서 재구현 가능
3.정적(static)메서드 : 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있음
4.private 메서드 : 인터페이스를 구현한 클래스에서 사용하거나 내부 클래스에서만 사용할수 있다. Override할수 있음



*/