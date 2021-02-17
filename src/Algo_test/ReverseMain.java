package Algo_test;

import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		ReverseArray Rarr= new ReverseArray();
		//리버스 어레이에 메모리를 줄거야
		System.out.println("요소수 : ");
		int num=stdIn.nextInt();//배열의 갯수
		
		int[] x=new int[num]; //배열의 갯수만큼 초기화
		
		System.out.println("요소를 역순으로 정렬 전 출력");
		for(int i=0;i<num;i++) {
			System.out.print("x[" + (i+1)+ "] : ");
			x[i]=stdIn.nextInt();//원하는 갯수 만큼 반복 입력 받음
		}
			Rarr.reverse(x);//교체 알고리즘을 이용하여 역순으로 정렬
			
			System.out.println("요소를 역순으로 정렬 후 출력");
			for(int j=0;j<num;j++)
				System.out.println("x[" + (j+1) + "] : " + x[j]);
			
		}

	}


