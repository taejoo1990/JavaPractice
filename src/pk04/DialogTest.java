package pk04;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject;
		int jumsu;
		
		subject=JOptionPane.showInputDialog("�����");
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("�� ��"));
		
		System.out.println("����� : " + subject);
		System.out.println("�� �� : " + jumsu);

	}

}
