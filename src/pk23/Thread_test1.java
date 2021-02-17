package pk23;

public class Thread_test1 extends Thread {
	//스레드 클래스에는 스레드를 작동시키기 위한 run()메서드가 반드시 있어야 한다.
	//메인에서 run()을 작동하기 위해 start()를 수행한다.
	@Override
	public void run() {
		
		for (int i=0; i <50; i++) {
			System.out.println("메리 ");
		}
	}

}
