package pk03;

public class Exampl05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while : rendom�Լ��� �̿��Ͽ� ������ �μ��� ���� -> �μ��� ���� 5�� �Ǹ� ���߰� ����
				while (true) {
					int num = (int) (Math.random() * 6) + 1;
					int sum = (int) (Math.random() * 6) + 1;
					System.out.println(num + "+" + sum + "=" + (num + sum));
					if (num + sum == 5) {
						break;
					}
				}

	}

}
