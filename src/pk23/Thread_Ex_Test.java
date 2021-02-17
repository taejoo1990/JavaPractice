package pk23;

public class Thread_Ex_Test {

	public static void main(String[] args) {
		
		Thread_Ex t1=new Thread_Ex();
		
		t1.start();//run()내부 실행

		
		try {
			Thread.sleep(2000);//2초
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
