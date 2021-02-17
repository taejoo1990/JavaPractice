package pk03;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String medal=JOptionPane.showInputDialog("메달 색깔을 입력하세요");
		
		switch (medal) {
			case "G":
				System.out.println("금메달");
				break;
				
			case "S":
				System.out.println("은메달");
				break;
				
			case "B":
				System.out.println("동메달");
				break;

			default:
				System.out.println("메달이 없습니다");
		}
		
		
		
	}

}
