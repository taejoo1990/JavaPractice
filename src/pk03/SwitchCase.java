package pk03;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rankig=Integer.parseInt(JOptionPane.showInputDialog("����Է�"));
		char medalColor;
		
	switch (rankig) {
		case 1:medalColor='G';
			break;
		case 2:medalColor='S';
			break;
		case 3:medalColor='B';
			break;
			default:
				medalColor='A';
		}
		
		System.out.println(rankig + "�� �޴��� ������" +medalColor+" �Դϴ�");

	}

}
