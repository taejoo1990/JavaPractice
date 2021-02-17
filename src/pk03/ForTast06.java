package pk03;

public class ForTast06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		System.out.println("1에서 5까지의 수");
		
		for (i=1;i<=5;i++) {
			if(i==3)
				break;//for문 종료
			//if(i==3)
				//continue;//3이면 수행 멈추고 for문 다시수행
			//시스아웃까지 안가고 컨티뉴를 통해 계산반복
			System.out.print(i + "\t");
		}
		
		
		
	/*	//1에서5라명시되있기에 예시1,2번처럼 하는게 좋다
		//예시1
		for (i=0;i<=5;i++) {
			System.out.print(i+1 + "\t");
		}
		//예시2
		for (i=1;i<=5;i++) {
			System.out.print(i + "\t");
		}
		//예시3
		for (i=0;i<=4;i++) {
			System.out.print(i+1 + "\t");
		}		*/

	}

}
