package pk11;

public class MainBoard {

	public static void main(String[] args) {
		//�⺻ ���� ���� 1�ܰ�
		Player p=new Player();
		p.play(1);
		
		//���� 2�ܰ�
		AdvancedLevel aLevel=new AdvancedLevel();
		p.upgradeLevel(aLevel);//AdvancedLevel ������ȯ
		p.play(2);
		
		//���� 3�ܰ�
		SuperLevel sLevel=new SuperLevel();
		p.upgradeLevel(sLevel);//SuperLevel ������ȯ
		p.play(3);
	}

}
