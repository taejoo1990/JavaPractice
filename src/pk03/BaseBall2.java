package pk03;

import java.util.Random;
import java.util.Scanner;

public class BaseBall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner scan = new Scanner(System.in);
		
		//컴퓨터가 발생할 난수 세 개
		int com1 = 0; 
		int com2 = 0;
		int com3 = 0;

		do {
			//1에서 9사이의 난수 발생
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (com1 == com2 || com1 == com3 || com2 == com3); 
		
		//사용자가 입력할 숫자.
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;

		while (true) {
			System.out.println("1 ~ 9 사이의 수를 입력하세요");
			System.out.print("첫번째 수를 입력 하세요 : ");
			user1 = scan.nextInt(); //사용자의 수를 입력 받는다.
			System.out.print("두번째 수를 입력 하세요 : ");
			user2 = scan.nextInt(); //사용자의 수를 입력 받는다.
			System.out.print("세번째 수를 입력 하세요 : ");
			user3 = scan.nextInt(); //사용자의 수를 입력 받는다.

			int strike = 0; // 스트라이크 갯수
			int ball = 0; // 볼 갯수 

			if (user1 == com1)  // 사용자가 입력한 첫번째 수가 1번째 				
				strike++;	//자리와 맞을 경우 스트라이크 판정
				
			// 숫자는 맞지만 자리수가 다를 경우 볼 판정
			else if ((user1 == com2)||(user1 == com3)) 
				ball++;

			if (user2 == com2) 
				strike++;
			else if ((user2 == com1)||(user2 == com3))
				ball++;

			if (user3 == com3) 
				strike++;
			else if ((user3 == com1)||(user3 == com2))
				ball++;

			if (strike == 3) { 
				System.out.println("정답 !! - " + 
							com1 + com2 + com3);
				break;         // while 종료
			}
			else{
				// 1스트라이크나 1볼이라도 있을 경우
				if ((strike > 0) || (ball > 0))   
					System.out.println(strike +"Strike, " 
								  + ball + "Ball");
				else  // 아무것도 없을 경우
					System.out.println("OUT!!");
			}	System.out.println("--------------------------");
		}//while의 끝
	}
}
		

