package pk09;

public class Child extends Parent{
	//Override / Overloading ==>다형성을 위해 사용한다는 공통점이 있다
	public void method2() {
		System.out.println("Child-method2()");//오버라이딩
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
//오버라이딩은 상속을 받아야만 사용할수있다
//오버로딩(Overloading) : 같은 이름을 사용할수 없다
                             //(매개변수를 다르게해서 차이를 줌)
//오버라이딩(Override) : 같은 이름을 사용할수있지만 내용은 바꿔줘야한다
                            //(매개변수상관없이 내용차이를 줌)
//프린트 시에는 같아도 상관없지만 다른경우에는 내용이 달라야 된다
                   //(보통은 다르게 하려고 쓰기에 신경 안써도 될듯)
//상속 클래스는 서브클래스의 변수를 부를수 없다