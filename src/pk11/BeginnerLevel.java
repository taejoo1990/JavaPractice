package pk11;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");	
	}
	@Override
	public void jump() {
		System.out.println("���� �ɷ��� �����ϴ�.");	
	}
	@Override
	public void turn() {
		System.out.println("�� �ɷ��� �����ϴ�.");
	}
	@Override
	public void showLevelMessge() {
		System.out.println("*****�ʺ� ���� �Դϴ�.*****");
		
	}

}
