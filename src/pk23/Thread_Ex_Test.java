package pk23;

public class Thread_Ex_Test {

	public static void main(String[] args) {
		
		Thread_Ex t1=new Thread_Ex();
		
		t1.start();//run()���� ����

		
		try {
			Thread.sleep(2000);//2��
			System.out.println("���α׷� ����");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
