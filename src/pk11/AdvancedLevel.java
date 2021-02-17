package pk11;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴 능력이 없습니다.");
	}

	@Override
	public void showLevelMessge() {
		System.out.println("*****중급자 레벨 입니다.*****");
	}

}
