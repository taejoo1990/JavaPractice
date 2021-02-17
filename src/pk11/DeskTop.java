package pk11;

public class DeskTop extends Computer{
	//추상 클래스를 상속 받을때는 추상메소드를 모두 재구현 해주어야 상속 받을 수 있어
	//하나라도 재구현되지 않은 추상메소드가 남아 있으면 기본 class로 인정하지 않는다 그러므로
	//클래스에도 adstract class롤 명시해
	
	@Override
	public void display() {
		System.out.println("DeskTop Display.");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop  typing.");
	}

	
}
