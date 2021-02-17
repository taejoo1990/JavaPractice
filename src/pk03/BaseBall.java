package pk03;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		//컴퓨터가 발생할 난수 세 개
	int com1=0;
	int com2=0;
	int com3=0;
		while (com1==com2||com1==com3||com2==com3) {
			com1= (int) (Math.random() * 9) + 1;
			com2= (int) (Math.random() * 9) + 1;
			com3= (int) (Math.random() * 9) + 1;
		}
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);

		//camputer가 숫자 준비 완료
		
		//사용자가 입력할  숫자
		
		int user1=0;
		int user2=0;
		int user3=0;
		
		while(true) {
			System.out.println("1~9 사이의 수를 입력하세요");
			System.out.println("첫번째 play 수를 입력하세요");
			user1=scan.nextInt();
			
			System.out.println("두번째 play 수를 입력하세요");
			user2=scan.nextInt();
			
			System.out.println("세번째 play 수를 입력하세요");
			user3=scan.nextInt();
			
			
			int strike =0;//스트라이크 갯수
			int ball =0;//볼 갯수
			
			if (com1==user1) {
				strike++;
			}
			if (com2==user2){
				strike++;
			}
			if (com3==user3){
				strike++;
			}
			else if(com1==user2 || com1==user3) {
				ball++;
			}
			else if(com2==user1 || com2==user3) {
				ball++;
			}
			else if(com3==user1 || com3==user2) {
				ball++;
			}
			System.out.println("----------------");
			System.out.println("스트라이크 :"+strike+" "+"볼 :"+ball);
			
			if (strike==3) {
				System.out.println("정답 - "+ com1 + com2 + com3);
				System.out.println("----------------");
				break;
			}
		if(strike!=3)
			System.out.println("Out!!");
		System.out.println("----------------");



			
			
			//만약에 사용자가 입력한 첫번째 play숫자와 com1이랑 같으면
			//strike에 1점 누적
			
			//숫자는 맞지만 자리수가 다를 경우 볼 판정
			//ball에 1점 누적
			
			
			//만약에 사용자가 입력한 첫번째 play숫자와 com2이랑 같으면
			//strike에 1점 누적
			
			//숫자는 맞지만 자리수가 다를 경우 볼 판정
			//ball에 1점 누적
			
			
			//만약에 사용자가 입력한 첫번째 play숫자와 com3이랑 같으면
			//strike에 1점 누적
			
			//숫자는 맞지만 자리수가 다를 경우 볼 판정
			//ball에 1점 누적
			
			//strike에 3점이면 WIN -> while문 끝
			
			//strike=0 ball=0 ->OUT!!
		}

	}

}
