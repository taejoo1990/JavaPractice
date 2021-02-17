package pk05;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		
		int num1,num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값 1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값 2"));
		
		//int res=num1/num2;
		//System.out.println(res);
		//Arithmetic 수학적 계산 Exception 오류
		try {
			System.out.println(num1/num2);//해당 작업중에
		}catch (ArithmeticException e) {  //에러가 나면
			System.out.println("숫자 0을 입력하시면 안됩니다");
		}
		System.out.println("프로그램 수행 끝");
	}

}
