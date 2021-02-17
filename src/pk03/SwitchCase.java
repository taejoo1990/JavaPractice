package pk03;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rankig=Integer.parseInt(JOptionPane.showInputDialog("등수입력"));
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
		
		System.out.println(rankig + "등 메달의 색깔은" +medalColor+" 입니다");

	}

}
