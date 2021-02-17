package pk11;

public class Player {
	/*
	PlayerLevel  level1=new BeginnerLevel();
	PlayerLevel  level2=new AdvancedLevel();
	PlayerLevel  level3=new SuperLevel();
	*/
	
	private PlayerLevel level;
	public Player() {
		level=new BeginnerLevel();
		level.showLevelMessge();
	}//비기너를 처음 호출할거야
	//Level return
	public PlayerLevel getLevel() {
		return level;
	}
	
	//AdvancedLevel,SuperLevel
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;//다른 클래스를 호출해서 덮어씌울거야
		level.showLevelMessge();
		//난이도들을 호출할거야
	}
	//게임 start
	public void play(int count) {
		level.go(count);//정해진 프로텍티드를 호출할거야

	}
}
