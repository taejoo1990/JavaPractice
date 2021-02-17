package pk13;

public class A {
	
	A(){
		System.out.println("A 객체가 생성");
	}
	/**인스턴스 멤버 클래스**/
	public class B{
		B(){
			System.out.println("B 객체가 생성");
		}
		//변수(인스턴스 변수 됨)
		int field1;
		//static int field2;//얘는 사용만가능//내부클래스에서 기준이 되는 전역변수 선언은 안됨
		
		//메서드
		void method() {}
		//static void method2() {}
		
	}
	/**정적 멤버 클래스**/
	static class C{
		C(){
			System.out.println("C 객체가 생성");
		}
		int field1;
		static int field2;
		//메서드
		void method1() {};
		static void method2() {};
	}
	
	void method() {
		/**로컬클래스**/
		class D{
			D(){
				System.out.println("D 객체가 생성");
			}
			int field1;
			//static int field2;//내부클래스에서 기준이되는 전역변수선언은 안됨
			
			//메서드
			void method1() {};
			//static void method2() {};
		}
		D d=new D();
		d.field1=3;
		d.method1();
		
	}
}
