package pk03;

import javax.swing.JOptionPane;

public class Exampl01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if문
		//두수를 입력 받아서(Num1 Num2) Num1이 크면"Num1(가)이 더 큽니다"
		//Num2이 크면"Num2(가)이 더 큽니다"
		//그 외 두 값이 같습니다.
		
		int Num1 = (int) (Math.random() * 6) + 1;
		
		int Num2 = (int) (Math.random() * 6) + 1;
		
		if(Num1>Num2) {
			System.out.println("Num1이 더 큽니다");
			System.out.println("Num1 값: " +Num1);
			System.out.println("Num2 값: " +Num2);
		}
		else if(Num1<Num2) {
			System.out.println("Num2이 더 큽니다");
			System.out.println("Num1 값: " +Num1);
			System.out.println("Num2 값: " +Num2);
		}	
		else {
			System.out.println("그 외 두 값이 같습니다.");
			System.out.println("Num1 값: " +Num1);
			System.out.println("Num2 값: " +Num2);
		/* 선생님 꺼
		Num1=Integer.parseInt(JOptionPane.showInputDialog("값1"))
		Num1=Integer.parseInt(JOptionPane.showInputDialog("값1"))
		if(Num1>Num2) {
			System.out.println("Num1이 더 큽니다");
			System.out.println("Num1 값: " +Num1);
			System.out.println("Num2 값: " +Num2);
		}
		else if(Num1<Num2) {
			System.out.println("Num2이 더 큽니다");
			System.out.println("Num1 값: " +Num1);
			System.out.println("Num2 값: " +Num2);
		}	
		else {
			System.out.println("그 외 두 값이 같습니다.");
			System.out.println("Num1 값: " +Num1);
			System.out.println("Num2 값: " +Num2)
	*/
		}
				
		
		

	}

}
