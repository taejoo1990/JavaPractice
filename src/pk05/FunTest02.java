package pk05;

import javax.swing.JOptionPane;

public class FunTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		int sum= addNum(num1,num2);
		System.out.println(num1 + "+" + num2 + "=" + sum);

	}
	
	//static method이면서 void가 아닌 int자료형
	//void가 아닐경우 return을 해줘야 된다
	public static int addNum(int n1, int n2) {
		int result=n1+n2;
		return result;
	}

}
