package Algo_test;

import java.util.Scanner;

public class MaxAl {

	public static void main(String[] args) {
		//3���� �������� �Է��ϰ� �ִ��� ����
		
		Scanner stdIn=new Scanner(System.in);
		int number;
		System.out.println("2�ڸ� ����� �Է��ϼ���");
		number=stdIn.nextInt();
		while(number>99 || number<10) {
			System.out.println("�ٽ� 2�ڸ� ����� �Է��ϼ���");
			number=stdIn.nextInt();
		}
		
		System.out.println("2�ڸ��� �����"+number);
		
		
		

	}

}
