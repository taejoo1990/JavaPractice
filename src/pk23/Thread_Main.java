package pk23;

import java.io.IOException;
import java.nio.CharBuffer;

public class Thread_Main implements Runnable{

	public static void main(String[] args) {
		
		System.out.println("����Ŭ���� ����");
		//������ ��ü ����
		Thread_Main t1=new Thread_Main();
		Thread mThread=new Thread(t1);
		mThread.start();
		//������ ����
		System.out.println("����Ŭ���� ����");
		System.out.println();

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
