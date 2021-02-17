package pk11;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner); //객체 생성이 안되는 부모 클래스 이므로 상속하면서 
							 //부모의 생성자를 반드시 구현	
	}
	
	//메소드
	public void internetsearch() {
		System.out.println("인터넷을 검색합니다.");
	}
	

}
