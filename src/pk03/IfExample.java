package pk03;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���̵�� java /��й�ȣ�� 12345�� �л��� ID pw�� �Է������� ������ "�α��� ����"
		// ���̵�� �°� ����� Ʋ���� "�α��� ���� : ��й�ȣ�� Ʋ�Ƚ��ϴ�"
		// ���̵� ����� �� Ʋ���� "�α��� ���� : ���̵� �������� �ʽ��ϴ�"
		String id = "java";
		int pw = 12345;
		Scanner scanner = new Scanner(System.in);

		System.out.println("���̵� : ");
		String name = scanner.nextLine();

		System.out.println("�н����� : ");
		String strpassword = scanner.nextLine();

		int password = Integer.parseInt(strpassword);

		if (name.equals(id)) {
			if (password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ���� : ��й�ȣ��  Ʋ�Ƚ��ϴ�");

			}

		} else {
			System.out.println("�α��� ���� : ���̵� �������� �ʽ��ϴ�");
		}

	}

}
