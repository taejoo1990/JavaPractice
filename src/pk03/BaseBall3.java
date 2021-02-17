package pk03;

import java.util.Scanner;

public class BaseBall3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int com1 = (int)(Math.random() * 9) + 1;
		int com2 = (int)(Math.random() * 9) + 1;
		int com3 = (int)(Math.random() * 9) + 1;
		
		do {
			System.out.println("1~9 사이의 수를 입력하세요");
			System.out.print("첫번째숫자 : ");
			int input_num1 = sc.nextInt();
			System.out.print("두번째숫자 : ");
			int input_num2 = sc.nextInt();
			System.out.print("세번째숫자 : ");
			int input_num3 = sc.nextInt();
			
			int strike = 0;	// 스트라이크 개수
			int ball = 0;	// 볼 개수
			
			//입력숫자1 == com1 인경우 스트라이크 하나 증가
			//입력숫자1 == com2 or com3 인경우 볼 하나 증가
			//숫자 안맞으면 아무것도 안함
			if (input_num1 == com1) {
				strike++;
			}
			else if (input_num1 == com2) {
				ball++;
			}
			else if (input_num1 == com3) {
				ball++;
			}
			////////////////////////////////////////////////////////
			if(input_num2 == com2) {
				strike++;
			}
			else if(input_num2 == com1) {
				ball++;
			}
			else if (input_num2 == com3) {
				ball++;
			}
			////////////////////////////////////////////////////////
			if(input_num3 == com3) {
				strike++;
			}
			else if(input_num3 == com1) {
				ball++;
			}
			else if(input_num3 == com2) {
				ball++;
			}
			
			//결과처리
			//3스트라이크인경우 승리 출력후 게임종료
			if(strike == 3) {
				System.out.println("Win!!!");
				System.out.println("게임 종료");
				break;
			}
			//0스트라이크인경우 0볼이면 out
			else if(strike ==0) {
				if(ball == 0)
					System.out.println("0스트라이크 0볼 OUT!!!");
			}
			//그 외는 O볼 O스트라이크 출력 후 다시 입력받는다
			else {
				System.out.println(strike + "스트라이크 " + ball + "볼");
			}
			
		} while (true);
		
	}

}
