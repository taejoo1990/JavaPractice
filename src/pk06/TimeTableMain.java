package pk06;

import java.util.Scanner;

public class TimeTableMain {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		TimeTable tt=new TimeTable();
		
		System.out.println("����� ���� �Է� : ");
		//int num=scan.nextInt();
		
		tt.showTable(scan.nextInt());
		//tt.showTable(num)
		//�ּ�ó��ó�� �����ʰ� ����ó�� �Ұ�� �޸𸮸� �Ƴ����ִ�.

	}

}
