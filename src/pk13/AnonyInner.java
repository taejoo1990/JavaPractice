package pk13;

public class AnonyInner {
	
	//test() �Լ�
	public void test() {
		
		//�͸��� Ŭ����. �������̽��� ������ ���̱� ������ �������̵��� �ʼ�
		new TestInter() {
			
			public void printDate() {
				System.out.println("�͸��� Ŭ���� printDate()");
			}//�߻�޼����� ������
		}.printDate();//TestInter
	}
	

	public static void main(String[] args) {
		AnonyInner In=new AnonyInner();
		In.test();

	}

}
