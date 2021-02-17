package pk11;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");	
	}
	@Override
	public void jump() {
		System.out.println("점프 능력이 없습니다.");	
	}
	@Override
	public void turn() {
		System.out.println("턴 능력이 없습니다.");
	}
	@Override
	public void showLevelMessge() {
		System.out.println("*****초보 레벨 입니다.*****");
		
	}

}
