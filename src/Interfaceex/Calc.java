package Interfaceex;

import pk08.StaticTest;

public interface Calc {
//�������̽��� ���� ���̳� ǥ�ø� ���ص� ���̳� ������
	
	//hip mamory
	//public static final double PI=3.14;//public static final : interface���� �ʵ� ����� ����� ���ǵ�
	double PI=3.14;//public static final ��������
	int ERROE=99999999;
	
	//public abstract int add (int num1, int num2);
	//�߻� �޼���
	int add (int num1, int num2);//public abstract ����
	int substract (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);
	
	//����Ʈ �޼���
	default void description() {
		System.out.println("������ ����մϴ�.");
		
	}
	
	static int total(int [] arr) {
		int total=0;
		
		for(int i:arr) {
			total +=i;
			
		}
		return total;
		
		/*//private method�� ���ο��� ��� �����ϹǷ� Override �Ұ���
		private void myMethod() {
			System.out.println("private �޼��� �Դϴ�.");
		}V13����
		private static void myStaticmyMethod() {
			System.out.println("private static �޼��� �Դϴ�.");
		}*/
		
		
	}
	

	
}


/*
1.�߻� �޼��� : �����ΰ� ���� �޼��� �� body{}�� ���� =>�߻� Ŭ����
------�ڹ� 8���� ����------
2.����Ʈ �޼��� : �⺻ ������ ������ �޼���, Override�� �� �� ����Ŭ�������� �籸�� ����
3.����(static)�޼��� : �ν��Ͻ� ������ ��� ���� �������̽� Ÿ������ ����� �� ����
4.private �޼��� : �������̽��� ������ Ŭ�������� ����ϰų� ���� Ŭ���������� ����Ҽ� �ִ�. Override�Ҽ� ����



*/