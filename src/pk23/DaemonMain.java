package pk23;

/*���� ������
���� ������� �ٸ� �Ϲ� ������ʹ� �ٸ��� ������ �۾��� �����ϴ� �������̴�
�Բ� �����Ǵ� �Ϲ� �����尡 ����Ǹ� ���󽺷��嵵 �ڵ����� ����ȴ�
*/

//������ �ۼ��ϴ� ���߿� 3�� �������� �ڵ� ���̺� �Ǵ� ���� ������ ����
public class DaemonMain implements Runnable{

	static boolean autoSave=false;
	
	public static void main(String[] args) {
		
		DaemonMain dm=new DaemonMain();//DaemonMain ��ü
		//t��� �����尡 ���󽺷������� ���
		Thread t=new Thread(dm);//Thread ��ü
		
		//���ν����尡 ����Ǹ� �Բ� ����ǵ���
		t.setDaemon(true);
		
		//run()����
		t.start();
		
		for (int i=1;i<=15; i++) {
			
			try {
				Thread.sleep(1000);//1��
			} catch (Exception e) {
				
			}
			System.out.println(i);
			
			if(i==3)//3�ʸ��� �ڵ����̺� ����
				autoSave=true;
		}
		System.out.println("���α׷� ����");
	}
	//===============================
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(3000);//3��
			} catch (Exception e) {
				e.printStackTrace();
			}
			//�޼��� ����
			if(autoSave==true)
				System.out.println("�ڵ������� ����˴ϴ�.");
		}
		
	}

}
