package Algo_test;

import java.util.Scanner;

public class MaxAl {

	public static void main(String[] args) {
		//3개의 정수값을 입력하고 최댓값을 구함
		
		Scanner stdIn=new Scanner(System.in);
		int number;
		System.out.println("2자리 양수를 입력하세요");
		number=stdIn.nextInt();
		while(number>99 || number<10) {
			System.out.println("다시 2자리 양수를 입력하세요");
			number=stdIn.nextInt();
		}
		
		System.out.println("2자리의 양수는"+number);
		
		
		

	}

}
