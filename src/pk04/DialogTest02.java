package pk04;

import javax.swing.JOptionPane;

public class DialogTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject;
		int jumsu;
		
		subject=JOptionPane.showInputDialog("과목명");
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("점 수"));
	
		JOptionPane.showMessageDialog(null, "과목명 : "+subject);
		JOptionPane.showMessageDialog(null, "점 수: "+jumsu);
		
	}

}
