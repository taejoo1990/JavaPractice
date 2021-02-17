package pk03;

import java.util.Scanner;

public class Exampl07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.예금 2.출금 3.잔금 4.종료 초기금액 10000원
		// while로 무한 반복(switch 1~4)

		boolean run = true;

		int balance = 20000;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------");
			System.out.println("1.예금 2.출금 3.잔금 4.종료");
			System.out.println("---------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				System.out.println("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.println("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.println("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();

		}
		System.out.println("프로그램 종료");
	}

}
