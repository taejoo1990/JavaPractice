package pk11;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� �ӵ��� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ������ ���� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("���� ���� ���մϴ�.");		
	}

	@Override
	public void showLevelMessge() {
		System.out.println("*****����� ���� �Դϴ�.*****");
	}

}
