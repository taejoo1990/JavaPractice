package pk04;

import javax.swing.JOptionPane;

public class DialogTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject;
		int jumsu;
		
		subject=JOptionPane.showInputDialog("�����");
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("�� ��"));
	
		JOptionPane.showMessageDialog(null, "����� : "+subject);
		JOptionPane.showMessageDialog(null, "�� ��: "+jumsu);
		
	}

}
