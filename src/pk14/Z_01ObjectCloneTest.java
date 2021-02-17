package pk14;

public class Z_01ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		//x=10 y=20 radius=5
		Circle circle=new Circle(10, 20, 5);//Circle,Point 객체 초기화
		
		Circle copyCircle=(Circle)circle.clone();
		//오브젝이 최상위 클래스이기에 (Circle)다운캐스팅
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		//HashCode 값 출력(서로 다른 hip메모리에 있음)
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		

	}

}
