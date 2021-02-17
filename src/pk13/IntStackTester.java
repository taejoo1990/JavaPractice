package pk13;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		IntStack s=new IntStack(5);//�ִ� 5���� Ǫ���� �� �ִ� ���� �޸� Ȯ��
		
		while (true) {
			System.out.println("���� ������ �� : "+s.size()+"/"+s.capacity());//0/5..5/5
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)����: ");
		
			int menu=sc.nextInt();
			if(menu==0)
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x=sc.nextInt();
				//s.push(x);// �����÷ο찡 ���� �ִ�
				try {
					s.push(x);//�Է��߿� //�����÷ο찡 �߻��Ҽ� �ֱ⿡tre catch���� ���
				}catch(IntStack.OverflowIntStackException e) {
					//Overflow ���� �߻��Ǹ� ��ü�� ����� �ȳ��� ���
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
				
			case 2:
				try {
					s.pop(); //���
				} catch (IntStack.EmptyIntStackException e) {
					//Underflow ���� �߻��Ǹ� ��ü�� ����� �ȳ��� ���
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					x=s.peek(); //���
					System.out.println("��ũ�� �����ʹ� : "+x+"�Դϴ�");
				} catch (IntStack.EmptyIntStackException e) {
					//Underflow ���� �߻��Ǹ� ��ü�� ����� �ȳ��� ���
					System.out.println("������ ��� �ֽ��ϴ�.");//�ȳ��� ���
				}
				break;
				
			case 4:
				s.clear();
				break;
			}
			
		}

	}

}
