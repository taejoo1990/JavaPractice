package pk23;

public class Thread_test1 extends Thread {
	//������ Ŭ�������� �����带 �۵���Ű�� ���� run()�޼��尡 �ݵ�� �־�� �Ѵ�.
	//���ο��� run()�� �۵��ϱ� ���� start()�� �����Ѵ�.
	@Override
	public void run() {
		
		for (int i=0; i <50; i++) {
			System.out.println("�޸� ");
		}
	}

}
