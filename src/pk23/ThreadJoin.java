package pk23;

public class ThreadJoin implements Runnable{

	public static void main(String[] args) {
		
		System.out.println("����Ŭ���� ����");
		ThreadJoin t1=new ThreadJoin();//������ ����
		Thread mt=new Thread(t1);//������ ����
		
		mt.start();
		
		try {
			//run()������ ����ɶ����� ������ ��ٸ���
			mt.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("����Ŭ���� ����");
		
	}

	@Override
	public void run() {
		System.out.println("run() �����");
		first();
	}
	public void first() {
		System.out.println("first()�����");
		second();
	}
	public void second() {
		System.out.println("second()�����");
	}

}
