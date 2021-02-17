package pk23;

public class ThreadJoin implements Runnable{

	public static void main(String[] args) {
		
		System.out.println("메인클래스 시작");
		ThreadJoin t1=new ThreadJoin();//스레드 조인
		Thread mt=new Thread(t1);//스레드 생성
		
		mt.start();
		
		try {
			//run()실행이 종료될때까지 메인은 기다린다
			mt.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("메인클래스 종료");
		
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
