package pk05;

import java.util.Scanner;

public class BrMethod {
	int cnt = 0;
	int input_num = 0;
	
	int[] bread = null;
	int count = 0;
	
	void makeBread() {
		System.out.println("�� �ϼ�!!");
	}
	
	void makeBread(int count) {
		bread = new int[count];
		
		for(int i = 0; i < bread.length; i++) {
			System.out.println( (i+1) + "�� �� �ϼ�!!!");
			
		}
		System.out.println("��û�Ͻ� " + count + "���� ���� ��� �ϼ��Ǿ����ϴ�");
	}
	
	void makeBread(int count, String name) {
		bread = new int[count];
		
		for(int i = 0; i < bread.length; i++) {
			System.out.println((i+1) + "��° " + name + " �ϼ�!!!");
		}
		System.out.println("��û�Ͻ� " + count + "���� " + name + "�� ��� �ϼ��Ǿ����ϴ�");
	}
	
	void order() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. �� ������ ���� | 2. �� ������ ���� ���� | 3. ����");
			System.out.print("���� > ");
			input_num = sc.nextInt();
			
			if(input_num == 1) {
				System.out.print("�ֹ��� �� ���� : ");
				cnt = sc.nextInt();
				makeBread(cnt);
				break;
			}
			if(input_num == 2) {
				System.out.print("�� ���� : ");
				cnt = sc.nextInt();
				
				System.out.print("�� �̸� : ");
				String name = sc.next();
				makeBread(cnt, name);
				break;
			}
			if(input_num == 3) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
	

}
