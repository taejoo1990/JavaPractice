package pk03;

import java.util.Scanner;

public class Exampl02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문
		/*
		Scanner를 통해 정수 n을 입력받는다.
		그리고 1부터 입력받은 정수 n까지의 합을 계산하여 그 결과를 출력하는 프로그램을 작성.
		얘룰 들어 정수 5를 입력받으면, 1 + 2 + 3 + 4 + 5의 연산결과인 15를 출력해야한다
		*/
		int result=0;
		
		System.out.println("숫자 입력 : ");
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt(); //int형 자료 받기
		
		
		for(int i=0;i<=n;i++) {
			result+=i; //result==i
		}
		System.out.println("1부터"+ n +"까지의 합 : "+result);

	}

}
