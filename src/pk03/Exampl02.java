package pk03;

import java.util.Scanner;

public class Exampl02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for��
		/*
		Scanner�� ���� ���� n�� �Է¹޴´�.
		�׸��� 1���� �Է¹��� ���� n������ ���� ����Ͽ� �� ����� ����ϴ� ���α׷��� �ۼ�.
		��� ��� ���� 5�� �Է¹�����, 1 + 2 + 3 + 4 + 5�� �������� 15�� ����ؾ��Ѵ�
		*/
		int result=0;
		
		System.out.println("���� �Է� : ");
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt(); //int�� �ڷ� �ޱ�
		
		
		for(int i=0;i<=n;i++) {
			result+=i; //result==i
		}
		System.out.println("1����"+ n +"������ �� : "+result);

	}

}
