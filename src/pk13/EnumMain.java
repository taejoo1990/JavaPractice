package pk13;

import java.util.Scanner;

public class EnumMain {

	public enum Item{
		//int [] arr;
		//enum arr �⺻������ �迭�� ������ �������� ������� ��� 
		//�־����� ���ڵ� ������� ��������
		Start, Pause, Exit
	}
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("========");
			System.out.println("0:���ӽ���");
			System.out.println("1:�Ͻ�����");
			System.out.println("2:��������");
			System.out.print("�ش��ϴ� ���ڸ� �Է��ϼ��� : ");
			
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			Item stert=Item.Start;//0
			Item exit=Item.Exit;//1
			Item pause=Item.Pause;//2
			
			if(n==stert.ordinal())
				System.out.println("������ ����");
			else if(n==pause.ordinal())
				System.out.println("���� �Ͻ�����");
			else {
				System.out.println("���� ����");
				return;
			}
		}

	}

}
