package pk14;

import javax.swing.JOptionPane;

public class WapperTest {

	public static void main(String[] args) {
		double num1,num2;
		char ch=65; //ch='A';
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("값1 "));
		num2=Double.parseDouble(JOptionPane.showInputDialog("값2 "));

		if(num2!=0) {
			System.out.println(num1/num2);
		}
		
		if(Character.isDigit(ch))//ch가 숫자인지 판단
			System.out.println(ch+"는 문자가 아닙니다.");
		else
			System.out.println(ch+"는 문자입니다.");
		
	}

}
