package pk12;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

	Scanner sc =new Scanner(System.in);
		// System.in.read() : 콘솔에 입력받기 모든 이력값을 아스키코드값
		// char ch=(char)System.in.read(); //문자형대 유지
		//int ch = System.in.read();
		
		
		while (true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 가장 높은 상담원에게 할당");
			System.out.println("S or s : 종료");	
			System.out.print("전화 상담 할당 방식을 선택하세요 : ");
			String mun =sc.nextLine();
			//스트링을 통해 문자를 받으면
			int ch=mun.charAt(0);//charAt(0):String->ACSII
			//아스키코드로 교환
			Scheduler s1 = null;//널값으로 다형성으로 상속받은 자료를 가지고 올수있다.
			
			//객체를  생성
			if (ch == 'R' || ch == 'r') {
				s1 = new RoundRobin();
				//r을 누르면 RoundRobin객체 생성을 해서 찾아봐
			} else if (ch == 'L' || ch == 'l') {
				s1 = new LeastJob();
				//l을 누르면 LeastJob객체 생성을 해서 찾아봐
			} else if (ch == 'P' || ch == 'p') {
				s1 = new PriorityAllocation();
				//p을 누르면PriorityAllocation객체 생성을 해서 찾아봐
			}else if(ch == 'S' || ch=='s') {
				System.out.println("시스템 종료");
				break;
				//s를 누르면 와일문을 종료해
			}else {
				System.out.println("잘못 누르셨습니다.");
				continue;//무시
			}//지정된 문자를 입력하지 못할경우 다시 시작하자
			s1.getNextCall();
			s1.sendCallToAgebt();
		}

	}

}
