package pk06;

import java.util.Scanner;

public class TimeTableMain {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		TimeTable tt=new TimeTable();
		
		System.out.println("출력할 단을 입력 : ");
		//int num=scan.nextInt();
		
		tt.showTable(scan.nextInt());
		//tt.showTable(num)
		//주석처리처럼 하지않고 현재처럼 할경우 메모리를 아낄수있다.

	}

}
