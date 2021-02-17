package pk03;

import javax.swing.JOptionPane;

public class SwitchCase05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month=Integer.parseInt(JOptionPane.showInputDialog("월을 입력하세요"));
		int day;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day=31;
			break;
		case 2:
			day=28;
		case 4: case 6: case 9: case 11:
			day=30;
			break;

		default:
			day=0;
			System.out.println("존재하지 않는 달입니다");
		
		}
		
		System.out.println(month + "월은" + day + "일 까지 있습니다");

	}

}
