package pk04;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject;
		int jumsu;
		
		subject=JOptionPane.showInputDialog("과목명");
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("점 수"));
		
		System.out.println("과목명 : " + subject);
		System.out.println("점 수 : " + jumsu);

	}

}
