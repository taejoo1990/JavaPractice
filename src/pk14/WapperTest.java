package pk14;

import javax.swing.JOptionPane;

public class WapperTest {

	public static void main(String[] args) {
		double num1,num2;
		char ch=65; //ch='A';
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("��1 "));
		num2=Double.parseDouble(JOptionPane.showInputDialog("��2 "));

		if(num2!=0) {
			System.out.println(num1/num2);
		}
		
		if(Character.isDigit(ch))//ch�� �������� �Ǵ�
			System.out.println(ch+"�� ���ڰ� �ƴմϴ�.");
		else
			System.out.println(ch+"�� �����Դϴ�.");
		
	}

}
