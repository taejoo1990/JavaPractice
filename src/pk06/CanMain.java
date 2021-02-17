package pk06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String select = "";
		int money = 0;

		Vending ven = new Vending();
		ven.init();// 음료수를 자판기에 전시

		System.out.print("돈을 투입하세요 : ");
		money = scan.nextInt();
		ven.showCans(money); //고객의 돈으로 선택할 수 있는 음료수 나열

		System.out.print("음료수를 선택하세요: ");
		select = scan.next();//String형으로 적어야 하기에 int는 빼준다
		ven.outCan(select);//선택한 음료이름과 잔액 출력
	}

}
