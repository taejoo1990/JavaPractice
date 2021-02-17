package pk03;

import java.util.Scanner;

public class IfExample09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("총점: ");
		double Jscore=Double.parseDouble(scanner.nextLine());
		
		System.out.println("인원수: ");
		double Pscore=Double.parseDouble(scanner.nextLine());
		
		System.out.println("----------------");
		if(Pscore != 0.0) {
			System.out.println("결과 : "+(Jscore/Pscore));
		}else {
			System.out.println("결과 : 학생이 등록되어 있지 않습니다");
		}
		

	}

}
