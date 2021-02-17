package pk13;

import java.util.Scanner;

public class EnumMain {

	public enum Item{
		//int [] arr;
		//enum arr 기본적으로 배열이 전제로 되있으며 순서대로 사용 
		//주어지는 숫자도 마음대로 설절가능
		Start, Pause, Exit
	}
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("========");
			System.out.println("0:게임시작");
			System.out.println("1:일시정지");
			System.out.println("2:게임종료");
			System.out.print("해당하는 숫자를 입력하세요 : ");
			
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			Item stert=Item.Start;//0
			Item exit=Item.Exit;//1
			Item pause=Item.Pause;//2
			
			if(n==stert.ordinal())
				System.out.println("게임이 시작");
			else if(n==pause.ordinal())
				System.out.println("게임 일시정지");
			else {
				System.out.println("게임 종료");
				return;
			}
		}

	}

}
