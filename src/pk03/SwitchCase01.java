package pk03;

import javax.swing.JOptionPane;

public class SwitchCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 : 예금조회를 선택하셨습니다
		// 2 : 예금출금을 선택하셨습니다
		// 3 : 예금입금을 선택하셨습니다
		// 4 : 계좌이체를 선택하셨습니다
		// 그밖에 : 번호를 잘못 누르셨습니다.
		int banknum=Integer.parseInt(JOptionPane.showInputDialog("1:조회 2:출금 3:입급 4:이체"));
		int number;
	
	switch (banknum) {
		case 1:
			System.out.println("예금조회를 선택하셨습니다");
			break;
		case 2:
			System.out.println("예금출금을 선택하셨습니다");
			break;
		case 3:
			System.out.println("예금입급을 선택하셨습니다");
			break;
		case 4:
			System.out.println("계좌이체를 선택하셨습니다");
			break;
		default:
			System.out.println("번호를 잘못 누르셨습니다.");
			break;
	
		}
	

	}

}
