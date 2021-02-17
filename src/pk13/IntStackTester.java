package pk13;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		IntStack s=new IntStack(5);//최대 5개를 푸시할 수 있는 스택 메모리 확보
		
		while (true) {
			System.out.println("현재 데이터 수 : "+s.size()+"/"+s.capacity());//0/5..5/5
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)종료: ");
		
			int menu=sc.nextInt();
			if(menu==0)
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x=sc.nextInt();
				//s.push(x);// 오버플로우가 날수 있다
				try {
					s.push(x);//입력중에 //오버플로우가 발생할수 있기에tre catch문을 사용
				}catch(IntStack.OverflowIntStackException e) {
					//Overflow 에러 발생되면 객체를 만들고 안내문 출력
					System.out.println("스텍이 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					s.pop(); //출력
				} catch (IntStack.EmptyIntStackException e) {
					//Underflow 에러 발생되면 객체를 만들고 안내문 출력
					System.out.println("스텍이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					x=s.peek(); //출력
					System.out.println("피크한 데이터는 : "+x+"입니다");
				} catch (IntStack.EmptyIntStackException e) {
					//Underflow 에러 발생되면 객체를 만들고 안내문 출력
					System.out.println("스텍이 비어 있습니다.");//안내문 출력
				}
				break;
				
			case 4:
				s.clear();
				break;
			}
			
		}

	}

}
