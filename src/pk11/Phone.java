package pk11;


//추상메소드가 없는 추상클래스로 구현 : 이유는 객체 생성을 막으려는 의도
public abstract class Phone {
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner=owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
		
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
		
	}
	
	
	
}
