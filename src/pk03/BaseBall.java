package pk03;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		//��ǻ�Ͱ� �߻��� ���� �� ��
	int com1=0;
	int com2=0;
	int com3=0;
		while (com1==com2||com1==com3||com2==com3) {
			com1= (int) (Math.random() * 9) + 1;
			com2= (int) (Math.random() * 9) + 1;
			com3= (int) (Math.random() * 9) + 1;
		}
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);

		//camputer�� ���� �غ� �Ϸ�
		
		//����ڰ� �Է���  ����
		
		int user1=0;
		int user2=0;
		int user3=0;
		
		while(true) {
			System.out.println("1~9 ������ ���� �Է��ϼ���");
			System.out.println("ù��° play ���� �Է��ϼ���");
			user1=scan.nextInt();
			
			System.out.println("�ι�° play ���� �Է��ϼ���");
			user2=scan.nextInt();
			
			System.out.println("����° play ���� �Է��ϼ���");
			user3=scan.nextInt();
			
			
			int strike =0;//��Ʈ����ũ ����
			int ball =0;//�� ����
			
			if (com1==user1) {
				strike++;
			}
			if (com2==user2){
				strike++;
			}
			if (com3==user3){
				strike++;
			}
			else if(com1==user2 || com1==user3) {
				ball++;
			}
			else if(com2==user1 || com2==user3) {
				ball++;
			}
			else if(com3==user1 || com3==user2) {
				ball++;
			}
			System.out.println("----------------");
			System.out.println("��Ʈ����ũ :"+strike+" "+"�� :"+ball);
			
			if (strike==3) {
				System.out.println("���� - "+ com1 + com2 + com3);
				System.out.println("----------------");
				break;
			}
		if(strike!=3)
			System.out.println("Out!!");
		System.out.println("----------------");



			
			
			//���࿡ ����ڰ� �Է��� ù��° play���ڿ� com1�̶� ������
			//strike�� 1�� ����
			
			//���ڴ� ������ �ڸ����� �ٸ� ��� �� ����
			//ball�� 1�� ����
			
			
			//���࿡ ����ڰ� �Է��� ù��° play���ڿ� com2�̶� ������
			//strike�� 1�� ����
			
			//���ڴ� ������ �ڸ����� �ٸ� ��� �� ����
			//ball�� 1�� ����
			
			
			//���࿡ ����ڰ� �Է��� ù��° play���ڿ� com3�̶� ������
			//strike�� 1�� ����
			
			//���ڴ� ������ �ڸ����� �ٸ� ��� �� ����
			//ball�� 1�� ����
			
			//strike�� 3���̸� WIN -> while�� ��
			
			//strike=0 ball=0 ->OUT!!
		}

	}

}
