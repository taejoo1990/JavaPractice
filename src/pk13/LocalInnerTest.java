package pk13;

import pk08.FinalTest;

class Outter1{
	//외부 클래스의 필드 선언
	int outNum=100;
	static int sNum=200;
	
	//메서드 Runnable 타입의 getRunnable(int i)생성
	//java.lang.Thread #run();
	Runnable getRunnble(int i) {//final int i
		//메서드 내부에 클래스 생성
		//지역 클래스 : 외부 클래스에서 볼때 메서드 처럼 사용
		class MyRunnable implements Runnable{
			int localNum=10;//필드
			//생성자
			
			//메서드
			@Override
			public void run() {
				//i=1;//매개변수가 final이므로 변경안됨
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outter1.sNum);
			}
			
		}
		return new MyRunnable();
	}
	
}
	
public class LocalInnerTest {
	
	public static void main(String[] args) {
		Outter out=new Outter();
		Runnable runner=out.getRunnable(10);
		 //타입은 러너블 타입
		runner.run();
	}

}
