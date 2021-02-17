package pk23;

import java.io.IOException;
import java.nio.CharBuffer;

public class Thread_Main implements Runnable{

	public static void main(String[] args) {
		
		System.out.println("메인클래스 시작");
		//스레드 객체 생성
		Thread_Main t1=new Thread_Main();
		Thread mThread=new Thread(t1);
		mThread.start();
		//스레드 수행
		System.out.println("메인클래스 종료");
		System.out.println();

	}
	@Override
	public void run() {
		System.out.println("run() 실행됨");
		first();
	}
	public void first() {
		System.out.println("first()실행됨");
		second();
	}
	public void second() {
		System.out.println("second()실행됨");
	}

}
