package pk05;

import javax.swing.JOptionPane;

public class FunTest01 {
	//Ŭ���� �ʵ�=�Ӽ�=�������
	//static�� mathod�̸鼭 voidŸ������ ����
	public static void sum(int a, int b) {
		int result=a+b;
		System.out.println("���� : "+result);
		
	}
	
	
	public static void main(String[] args) {
		int num1,num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		sum(num1,num2);
		

	}

}
