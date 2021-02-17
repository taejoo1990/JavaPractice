package pk13;

public class AMain {

	public static void main(String[] args) {
		A a=new A();
		
		//인스턴스 멤버클래스(innerClass) 객체 생성(일반 내부클래스)
		A.B b=a.new B();
		//A클래스를B로 들어가 a객체를 통해 b객체를 들어갈거야
		
		//정적 멤버클래스(static)객체 생성
		A.C c=new A.C();
		//A클래스를C로 들어가 스텍틱이있어서 바로c객체를 생성할거야 
		
		//로컬 클래스 호출
		a.method();
	}

}
