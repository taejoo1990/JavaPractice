package pk05;

import javax.swing.JOptionPane;

public class FunTest01 {
	//클래스 필드=속성=멤버변수
	//static형 mathod이면서 void타입으로 구현
	public static void sum(int a, int b) {
		int result=a+b;
		System.out.println("합은 : "+result);
		
	}
	
	
	public static void main(String[] args) {
		int num1,num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		sum(num1,num2);
		

	}

}
