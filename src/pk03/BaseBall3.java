package pk03;

import java.util.Scanner;

public class BaseBall3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int com1 = (int)(Math.random() * 9) + 1;
		int com2 = (int)(Math.random() * 9) + 1;
		int com3 = (int)(Math.random() * 9) + 1;
		
		do {
			System.out.println("1~9 ������ ���� �Է��ϼ���");
			System.out.print("ù��°���� : ");
			int input_num1 = sc.nextInt();
			System.out.print("�ι�°���� : ");
			int input_num2 = sc.nextInt();
			System.out.print("����°���� : ");
			int input_num3 = sc.nextInt();
			
			int strike = 0;	// ��Ʈ����ũ ����
			int ball = 0;	// �� ����
			
			//�Է¼���1 == com1 �ΰ�� ��Ʈ����ũ �ϳ� ����
			//�Է¼���1 == com2 or com3 �ΰ�� �� �ϳ� ����
			//���� �ȸ����� �ƹ��͵� ����
			if (input_num1 == com1) {
				strike++;
			}
			else if (input_num1 == com2) {
				ball++;
			}
			else if (input_num1 == com3) {
				ball++;
			}
			////////////////////////////////////////////////////////
			if(input_num2 == com2) {
				strike++;
			}
			else if(input_num2 == com1) {
				ball++;
			}
			else if (input_num2 == com3) {
				ball++;
			}
			////////////////////////////////////////////////////////
			if(input_num3 == com3) {
				strike++;
			}
			else if(input_num3 == com1) {
				ball++;
			}
			else if(input_num3 == com2) {
				ball++;
			}
			
			//���ó��
			//3��Ʈ����ũ�ΰ�� �¸� ����� ��������
			if(strike == 3) {
				System.out.println("Win!!!");
				System.out.println("���� ����");
				break;
			}
			//0��Ʈ����ũ�ΰ�� 0���̸� out
			else if(strike ==0) {
				if(ball == 0)
					System.out.println("0��Ʈ����ũ 0�� OUT!!!");
			}
			//�� �ܴ� O�� O��Ʈ����ũ ��� �� �ٽ� �Է¹޴´�
			else {
				System.out.println(strike + "��Ʈ����ũ " + ball + "��");
			}
			
		} while (true);
		
	}

}
