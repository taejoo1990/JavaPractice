package pk11;

//추상클래슨는 추상메소드를 하나이상 포함하는것
public abstract class Computer {
	
	//모두 다형성 만족
	//추상 메소드 : 존재만 주고 알아서해라
	//사용목적 : 기존에 바디없이 상속하거나 메소드 하나를 만들어 두고 오버라이딩을 해서 
	//사용하는것이 상속이라면 오버라이딩이나 바디없이 받아서 재구현해서 사용하느니 처음부터 이름만 
	//만들어서 상속하고 각각 구현해서 사용하는것이 목적이야
	
	//추상메소드를 받아옴 (Computer) : 구현되지 않은 추상메소드가 하나라도 포함되어있으면
	//==>타입상속
	
	//인터페이스 : 뼈대를 만들어놓고 추상메서드를 만듬
	public abstract void display();
	public abstract void typing();
	
	//정상 메소드
	public void turnON() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
