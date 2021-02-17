package pk05;

import javax.swing.JOptionPane;

public class FunTest03 {
	
	public void sum(int a, int b) {
		int result=a+b;
		System.out.println("합은 : "+result);
	}

	public static void main(String[] args) {
		int num1,num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		//static에서 호출하지 않았으므로 반드시 객체를 만들어 메모리를 확보하고 사용해야 한다.
		//sum(num1, num2);에러
		FunTest03 Obj=new FunTest03();
		Obj.sum(num1,num2);
		
	}

}
