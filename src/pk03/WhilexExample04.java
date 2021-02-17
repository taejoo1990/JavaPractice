package pk03;

import javax.swing.JOptionPane;

public class WhilexExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 숫자가 6이되면 멈추게

		while (true) {
			int num =2;
					
			System.out.println(num);
			if (num == 6) {
				break;
			}
			
		}
		System.out.println("어려워");

		// do while 또는 while(두수가 다르면 멈춤)
		// swing을 이용하요 두수를 입력받아서 두수가 같으면 "Same!" 를 출력후 멈추고 다르면 "Different!"출력 후 멈춤
		int Num1, Num2;
		do {
			Num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
			Num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
			if(Num1 ==Num2) {
				System.out.println("Same!");
				break;
			}
			System.out.println("Different!");
			
		}while (Num1 != Num2);
	}

}
