package pk13;

import pk08.FinalTest;

class Outter1{
	//�ܺ� Ŭ������ �ʵ� ����
	int outNum=100;
	static int sNum=200;
	
	//�޼��� Runnable Ÿ���� getRunnable(int i)����
	//java.lang.Thread #run();
	Runnable getRunnble(int i) {//final int i
		//�޼��� ���ο� Ŭ���� ����
		//���� Ŭ���� : �ܺ� Ŭ�������� ���� �޼��� ó�� ���
		class MyRunnable implements Runnable{
			int localNum=10;//�ʵ�
			//������
			
			//�޼���
			@Override
			public void run() {
				//i=1;//�Ű������� final�̹Ƿ� ����ȵ�
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outter1.sNum);
			}
			
		}
		return new MyRunnable();
	}
	
}
	
public class LocalInnerTest {
	
	public static void main(String[] args) {
		Outter out=new Outter();
		Runnable runner=out.getRunnable(10);
		 //Ÿ���� ���ʺ� Ÿ��
		runner.run();
	}

}
