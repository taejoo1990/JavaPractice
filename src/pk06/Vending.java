package pk06;

public class Vending {
	// �ʵ�
	private Can[] can = new Can[5];// �迭��ü
	// 5���� �迭�� ����� �ٰž�
	private int money;// ���� ��

	// ������

	// �ʱ�ȭ �޼���(�����ڸ� �׷�ȭ)
	public void init() {
		// ��ü�� �ʱ�ȭ
		can[0] = new Can("����������", 800);
		can[1] = new Can("�Ƹ޸�ī��", 900);
		can[2] = new Can("ī���", 1000);
		can[3] = new Can("�ٴҶ��", 1100);
		can[4] = new Can("ī��Ḷ���ƶ�", 1200);
	}
	// for->if

	public void showCans(int m) {
		money = m;

		for (int i = 0; i < can.length; i++) {
			// i�� �ϳ� �� �߰��ϸ鼭 can�̶� ���Ұž�
			if (can[i].getPrice() <= money) {// money����getPrice�۰ų� ������ ����� �̸��� ������ �����ִ�
				// canŬ�������� �����ͼ� money�� ���Ұž�
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice());
			} // ���� �����Ѱ� ���Ϸ� �����ٰž�
				// ����������-800�� /ī���-1000�� /�Ƹ޸�ī��-900��
		}
	}
	// out Can() �޼��� �߰�

	public void outCan(String name) {

		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "�� �����ϼ̽��ϴ�.");

				System.out.println("�ܾ� : " + (money - can[i].getPrice() + "��"));
			}
		}
	}

}
