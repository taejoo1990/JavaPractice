package pk11;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빛의 속도로 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 여러번 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("여러 바퀴 턴합니다.");		
	}

	@Override
	public void showLevelMessge() {
		System.out.println("*****고급자 레벨 입니다.*****");
	}

}
