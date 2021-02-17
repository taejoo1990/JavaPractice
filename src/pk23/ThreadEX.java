package pk23;


/*
스레드는 독립적인  실행단위이다.
인터넷을 하면서 음악을 듯는 것처럼 한번에 여러개의 프로세스가 실행되는 것
실제로는 동시에 두개가 실행되는 것이 아니고 운영체제 내부 스케줄러가 동시에 돌아가는 것처럼 실행하는 것
이것을 스레드라고 한다.
*/

//싱글스레드
public class ThreadEX extends Thread{

	@Override
	public void run() {
		//프로세스의 독립적인 수행을 위한 영역
		for (int i=0; i<10; i++) {
			System.out.println("스레드 영역");
		}
	}

	
	
}
