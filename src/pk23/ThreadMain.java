package pk23;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadEX t=new ThreadEX();
		//t.run(); //run()�� ���������� �������� ���Ѵ�
		//run() �޼��鸦 ȣ�����ִ� start()�� �����ؾ� ���������� �����
		t.start();
		
		System.out.println("main ����");
		
		
	}

}
