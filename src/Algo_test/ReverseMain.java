package Algo_test;

import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		ReverseArray Rarr= new ReverseArray();
		//������ ��̿� �޸𸮸� �ٰž�
		System.out.println("��Ҽ� : ");
		int num=stdIn.nextInt();//�迭�� ����
		
		int[] x=new int[num]; //�迭�� ������ŭ �ʱ�ȭ
		
		System.out.println("��Ҹ� �������� ���� �� ���");
		for(int i=0;i<num;i++) {
			System.out.print("x[" + (i+1)+ "] : ");
			x[i]=stdIn.nextInt();//���ϴ� ���� ��ŭ �ݺ� �Է� ����
		}
			Rarr.reverse(x);//��ü �˰����� �̿��Ͽ� �������� ����
			
			System.out.println("��Ҹ� �������� ���� �� ���");
			for(int j=0;j<num;j++)
				System.out.println("x[" + (j+1) + "] : " + x[j]);
			
		}

	}


