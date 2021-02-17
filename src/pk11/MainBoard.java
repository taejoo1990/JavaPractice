package pk11;

public class MainBoard {

	public static void main(String[] args) {
		//기본 게임 레벨 1단계
		Player p=new Player();
		p.play(1);
		
		//레벨 2단계
		AdvancedLevel aLevel=new AdvancedLevel();
		p.upgradeLevel(aLevel);//AdvancedLevel 레벨전환
		p.play(2);
		
		//레벨 3단계
		SuperLevel sLevel=new SuperLevel();
		p.upgradeLevel(sLevel);//SuperLevel 레벨전환
		p.play(3);
	}

}
