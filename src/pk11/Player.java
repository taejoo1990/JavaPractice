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
	}//���ʸ� ó�� ȣ���Ұž�
	//Level return
	public PlayerLevel getLevel() {
		return level;
	}
	
	//AdvancedLevel,SuperLevel
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;//�ٸ� Ŭ������ ȣ���ؼ� �����ž�
		level.showLevelMessge();
		//���̵����� ȣ���Ұž�
	}
	//���� start
	public void play(int count) {
		level.go(count);//������ ������Ƽ�带 ȣ���Ұž�

	}
}
