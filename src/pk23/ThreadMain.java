package pk23;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadEX t=new ThreadEX();
		//t.run(); //run()은 독립적으로 수행하지 못한다
		//run() 메서들를 호출해주는 start()로 실행해야 독립적으로 수행됨
		t.start();
		
		System.out.println("main 종료");
		
		
	}

}
