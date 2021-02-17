package pk08;

import java.security.Guard;
import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		
		System.out.print("관광객 수 : ");
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		
		Guide guide=new Guide(n);
		
		System.out.println("관광객 등록");
		for(int i=0;i<n;i++) {
			
			System.out.print((i+1) + ". 이름 : ");
			guide.guest[i].setName(scan.next());
			
			System.out.print((i+1) + ". 성별 : ");
			String g=scan.next();
			guide.guest[i].setGender(g);
		}
		
		outer : while(true) {
			
			System.out.println("1. 관광객 정보 ");//이름, 성별, 목적지
			System.out.println("2. 목적지 변경 ");//목적지 변경
			System.out.println("3. 종료 ");
			System.out.println("선택>>");
			
			
			int select=scan.nextInt();
			
			switch (select) {
			case 1:
				for(int i=0;i<n;i++) {
					System.out.println((i+1)+".이름 : "+guide.guest[i].getName());
					System.out.println((i+1)+".성별 : "+guide.guest[i].getGender());
					System.out.println((i+1)+".목적지 : "+guide.guest[i].getPoint());
					System.out.println();
				}
				System.out.println("-------------------");
				break;
				
			case 2:
				System.out.print("변경하실 여행 목적지를 입력하세요 : ");
				Guide.point=scan.next();//스테틱변수 활용
				System.out.println(Guide.point +"(으)로 변경되었습니다");
				System.out.println("-------------------");
				break;
				
			case 3:
				System.out.println("프로그램을 종료합니다");
				break outer;
			}
		}
		
	}

}
