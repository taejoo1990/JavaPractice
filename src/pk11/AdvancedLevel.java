package pk11;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� �ɷ��� �����ϴ�.");
	}

	@Override
	public void showLevelMessge() {
		System.out.println("*****�߱��� ���� �Դϴ�.*****");
	}

}
