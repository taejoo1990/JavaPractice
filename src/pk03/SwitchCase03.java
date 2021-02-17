package pk03;

import java.util.Scanner;

public class SwitchCase03 {

	public static void main(String[] args) {
		//break를 쓰는이유
		char grade='B';
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int a = sc.nextInt();
		
		switch (grade) {
			case 'A':
				System.out.println("VIP 회원입니다");
				
			case 'a':
				System.out.println("최우수 회원입니다");
				break;

			case 'B':
				System.out.println("우수 회원입니다");
				
			case 'b':
				System.out.println("일반 회원입니다");
				break;

			default:
				System.out.println("손놈 입니다");
				break;
		}

	}

}
