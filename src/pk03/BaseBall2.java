package pk03;

import java.util.Random;
import java.util.Scanner;

public class BaseBall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner scan = new Scanner(System.in);
		
		//��ǻ�Ͱ� �߻��� ���� �� ��
		int com1 = 0; 
		int com2 = 0;
		int com3 = 0;

		do {
			//1���� 9������ ���� �߻�
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (com1 == com2 || com1 == com3 || com2 == com3); 
		
		//����ڰ� �Է��� ����.
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;

		while (true) {
			System.out.println("1 ~ 9 ������ ���� �Է��ϼ���");
			System.out.print("ù��° ���� �Է� �ϼ��� : ");
			user1 = scan.nextInt(); //������� ���� �Է� �޴´�.
			System.out.print("�ι�° ���� �Է� �ϼ��� : ");
			user2 = scan.nextInt(); //������� ���� �Է� �޴´�.
			System.out.print("����° ���� �Է� �ϼ��� : ");
			user3 = scan.nextInt(); //������� ���� �Է� �޴´�.

			int strike = 0; // ��Ʈ����ũ ����
			int ball = 0; // �� ���� 

			if (user1 == com1)  // ����ڰ� �Է��� ù��° ���� 1��° 				
				strike++;	//�ڸ��� ���� ��� ��Ʈ����ũ ����
				
			// ���ڴ� ������ �ڸ����� �ٸ� ��� �� ����
			else if ((user1 == com2)||(user1 == com3)) 
				ball++;

			if (user2 == com2) 
				strike++;
			else if ((user2 == com1)||(user2 == com3))
				ball++;

			if (user3 == com3) 
				strike++;
			else if ((user3 == com1)||(user3 == com2))
				ball++;

			if (strike == 3) { 
				System.out.println("���� !! - " + 
							com1 + com2 + com3);
				break;         // while ����
			}
			else{
				// 1��Ʈ����ũ�� 1���̶� ���� ���
				if ((strike > 0) || (ball > 0))   
					System.out.println(strike +"Strike, " 
								  + ball + "Ball");
				else  // �ƹ��͵� ���� ���
					System.out.println("OUT!!");
			}	System.out.println("--------------------------");
		}//while�� ��
	}
}
		

