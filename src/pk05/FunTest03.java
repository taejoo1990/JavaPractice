package pk05;

import javax.swing.JOptionPane;

public class FunTest03 {
	
	public void sum(int a, int b) {
		int result=a+b;
		System.out.println("���� : "+result);
	}

	public static void main(String[] args) {
		int num1,num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		//static���� ȣ������ �ʾ����Ƿ� �ݵ�� ��ü�� ����� �޸𸮸� Ȯ���ϰ� ����ؾ� �Ѵ�.
		//sum(num1, num2);����
		FunTest03 Obj=new FunTest03();
		Obj.sum(num1,num2);
		
	}

}
