package pk03;

public class ForTast03 {

	public static void main(String[] args) {
		// 1~10������ ��

		int i; // �ε��� ����
		int sum = 0;

		for (i = 1; i <= 10; i++) {//���� int i�� �����߱⿡ for����
			sum += i;              //��Ʈ�� ���� �ϸ� �ȵȴ�
		//for (i = 0; i < 10; i++) ���� ����
		//sum +=(i+1);
		}
		System.out.print("1���� 10������ ����" + sum + "�Դϴ�");

	}

}
