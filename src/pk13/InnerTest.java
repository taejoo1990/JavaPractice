package pk13;

//외부 클래스
class OutClass {
	// 외부 클래스의 필드
	private int num = 0;
	private static int sNum = 20;
	InClass inClass;

	// 생성자(Construct)를 통해서 내부클래스 객체가 생성
	public OutClass() {
		//inClass = new InClass();// 내부클래스 생성
		//usingClass에서 생성 현업에서는 usingClass처럼이용
	}

	// 내부 클래스(Non-static)
	// 인스턴스 내부 클래스 : 외부클래스에서 볼때 멤버변수와 통일
	// 인스턴스 내부 클래스에서 사용할 수 있는 변수 : 외부 인스턴스 변수 (멤버변수=필드=속성),
	// 외부인스턴스 변수의 전역변수(static)(사용만)
	// 객체 생성방법 : 외부클래스를 먼저 만든 후 내부 클래스 생성
	class InClass {
		int inNum = 100;// 내부 클래스의 필드
		// static은 기준이 되고 변경없이 사용하려는 목적이므로 다른곳에서 재정의 할 수 없다
		// static sNum=210;//에러 남
		int num = 0;

		void inTest() {

			System.out.println("OutClass num = " + num + "(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 전역 변수)");
		}

	}

	// 외부 클래스의 메서드
	public void usingClass() {
		inClass.inTest();
	}

	// 정적 내부 클래스(static)
	// 정적 내부 클래스 : 외부클래스에서 볼때 멤버변수와 통일
	// 정적 내부 클래스에서 사용할 수 있는 변수 : 외부인스턴스 변수의 전역변수(static)
	// 객체 생성방법 : 외부클래스와는 무관하게 내부 클래스 생성
	static class InStaticClass {
		// 멤버변수
		int inNum = 100;
		static int sInNum = 200;

		// num=200;//객체가 있어야 사용가능하므로 불가
		void inTest() {
			// 외부클래스의 인스턴스 변수를 사용할 수 없는 이유:
			// 스태틱 처음부터 데이터영역에 잡혀있고 외부 인스턴스는 반드시 객체생성을
			// 해야되니까 접근이 불가능
			// 내가 올지 안올지 모르니 나 알려달라고 다른사람 못데려온다
			// static 클래스는 프로그램 시작과 동시에 이미 메모리에 올라가
			// 근데 num은 스테이틱 선언이 안돼있는놈이니까 실행을 시키면서 중간에 올라가는놈이니까
			// 이미 메모리에 올라가있는애가 가져다 쓰려고 하는데 응? 너 어디갔어 이상황이 되는거지
			// num+=10;
			inNum = 100;
			sInNum = 200;
			sNum = 300;// 외부 클래스의 스택틱
			System.out.println("InStaticClass inNum =" + inNum + "(내부 인스턴스 변수)");
			System.out.println("InStaticClass sinNum =" + sInNum + "(내부 static)");
			System.out.println("InStaticClass sNum =" + sNum + "(외부 static)");
			// System.out.println("InStaticClass sNum ="+Num+"(외부 인스턴스 변수)");
		}

		static void sTest() {
			// num+=10;
			// inNum+=10;
			sInNum = 200;
			sNum = 300;// 외부 클래스의 스택틱
			System.out.println("InStaticClass sNum =" + sNum + "(외부클래스의 인스턴스 변수)");
			System.out.println("InStaticClass sinNum =" + sNum + "(외부클래스의 전역 변수)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		//private으로 변수 접근시 호출
		System.out.println("private으로 변수 접근시 호출");
		OutClass outClass = new OutClass();
		outClass.usingClass();
		System.out.println();
		
		
		
		// 외부 클래스를 먼저 만들고 그 객체를 이용해서 내부 클래스 객체 생성
		//OutClass outClass = new OutClass();
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("일반 내부 클래스의 일반 메서드 호출");
		inClass.inTest();
		System.out.println();

		// 외부클래스를 생성하지 않고 바로 정적 내부 클래스
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스의 일반 메서드 호출");
		sInClass.inTest();
		System.out.println("정적 내부 클래스의 Static 메서드 호출");
		sInClass.sTest();
		OutClass.InStaticClass.sTest();
		;
	}

}
