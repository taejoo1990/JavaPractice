package pk06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String select = "";
		int money = 0;

		Vending ven = new Vending();
		ven.init();// ������� ���Ǳ⿡ ����

		System.out.print("���� �����ϼ��� : ");
		money = scan.nextInt();
		ven.showCans(money); //���� ������ ������ �� �ִ� ����� ����

		System.out.print("������� �����ϼ���: ");
		select = scan.next();//String������ ����� �ϱ⿡ int�� ���ش�
		ven.outCan(select);//������ �����̸��� �ܾ� ���
	}

}
