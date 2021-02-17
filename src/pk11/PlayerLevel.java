package pk11;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessge();
		
	final public void go(int count) {//프로텍티드 설정
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
	
}
