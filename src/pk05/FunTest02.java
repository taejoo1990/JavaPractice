package pk05;

import javax.swing.JOptionPane;

public class FunTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		int sum= addNum(num1,num2);
		System.out.println(num1 + "+" + num2 + "=" + sum);

	}
	
	//static method�̸鼭 void�� �ƴ� int�ڷ���
	//void�� �ƴҰ�� return�� ����� �ȴ�
	public static int addNum(int n1, int n2) {
		int result=n1+n2;
		return result;
	}

}
