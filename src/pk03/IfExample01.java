package pk03;

import javax.swing.JOptionPane;

public class IfExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog("���Է� : "));
		if(dat%10 == 0) {
			System.out.println(dat+"(��)�� 10�� ����Դϴ�");
		}
		else {
			System.out.println(dat+"(��)�� 10�� ����� �ƴմϴ�");
		}

	}

}
