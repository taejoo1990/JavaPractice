package pk23;

import java.util.Scanner;

/*
���� : 
��ĳ�ʸ� �̿��Ͽ� Ű���忡�� ���ڸ� �Է¹ް�
�����忡�� �Է¹��� ���ڰ� 1�� �����ϴٰ� 0�� �Ǿ��� ��
"����" ��� �޽����� �Բ� �����带 ������������ ������.
*/

public class ThreadCount implements Runnable{

	private int n;
	
	public ThreadCount(int n) {
		this.n=n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("���� �Է� : ");
		Scanner sc=new Scanner(System.in);
		
		
		ThreadCount t=new ThreadCount(sc.nextInt());
		Thread tt=new Thread(t);
		
		tt.start();
	}

	@Override
	public void run() {
		for (int i = n; i >=0; i--) {
			
			try {
				System.out.println(i);
				Thread.sleep(1000);//1��
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		System.out.println();
		System.out.println("����");
	}

}
