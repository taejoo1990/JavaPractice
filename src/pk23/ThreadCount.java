package pk23;

import java.util.Scanner;

/*
문제 : 
스캐너를 이용하여 키보드에서 숫자를 입력받고
스레드에서 입력받은 숫자가 1씩 감소하다가 0이 되었을 때
"종료" 라는 메시지와 함께 스레드를 빠져나오도록 만들어보자.
*/

public class ThreadCount implements Runnable{

	private int n;
	
	public ThreadCount(int n) {
		this.n=n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("값을 입력 : ");
		Scanner sc=new Scanner(System.in);
		
		
		ThreadCount t=new ThreadCount(sc.nextInt());
		Thread tt=new Thread(t);
		
		tt.start();
	}

	@Override
	public void run() {
		for (int i = n; i >=0; i--) {
			
			try {
				System.out.println(i);
				Thread.sleep(1000);//1초
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		System.out.println();
		System.out.println("종료");
	}

}
