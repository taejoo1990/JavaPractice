package pk12;

//C언어에서는 다중 상속이 가능한데 자바에서는 다중상속이 지원되지 않는다
//자바에서 다중상속은 선언되어 있지 않은 메서드로만 구성된 인터페이스만이 가능하기때문에 interface가 존재한다
/*interface와 abstract의 차이점
1interface : 모든 메서드가 추상/ abstracts는 일반클래스 + 추상클래스로 구성
2.abstracts는 C언어와 달리 다중 상속이 안되고 interface는 다중 상속이 가능
*/
public class Multiple extends CompleteCalc implements Calc, Runnable, Test{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}
