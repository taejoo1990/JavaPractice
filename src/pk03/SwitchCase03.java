package pk03;

import java.util.Scanner;

public class SwitchCase03 {

	public static void main(String[] args) {
		//break�� ��������
		char grade='B';
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ �Է� : ");
		int a = sc.nextInt();
		
		switch (grade) {
			case 'A':
				System.out.println("VIP ȸ���Դϴ�");
				
			case 'a':
				System.out.println("�ֿ�� ȸ���Դϴ�");
				break;

			case 'B':
				System.out.println("��� ȸ���Դϴ�");
				
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�");
				break;

			default:
				System.out.println("�ճ� �Դϴ�");
				break;
		}

	}

}
