package pk23;

/*데몬 스레드
데몬 스레드는 다른 일반 스레드와는 다르게 원래의 작업을 보조하는 스레드이다
함께 구동되는 일반 스레드가 종료되면 데몬스레드도 자동으로 종료된다
*/

//문서를 작성하는 도중에 3초 간격으로 자동 세이브 되는 데몬 스레드 구현
public class DaemonMain implements Runnable{

	static boolean autoSave=false;
	
	public static void main(String[] args) {
		
		DaemonMain dm=new DaemonMain();//DaemonMain 객체
		//t라는 스레드가 데몬스레드임을 명시
		Thread t=new Thread(dm);//Thread 객체
		
		//메인스레드가 종료되면 함께 종료되도록
		t.setDaemon(true);
		
		//run()수행
		t.start();
		
		for (int i=1;i<=15; i++) {
			
			try {
				Thread.sleep(1000);//1초
			} catch (Exception e) {
				
			}
			System.out.println(i);
			
			if(i==3)//3초마다 자동세이브 시작
				autoSave=true;
		}
		System.out.println("프로그램 종료");
	}
	//===============================
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(3000);//3초
			} catch (Exception e) {
				e.printStackTrace();
			}
			//메서드 실행
			if(autoSave==true)
				System.out.println("자동저장이 수행됩니다.");
		}
		
	}

}
