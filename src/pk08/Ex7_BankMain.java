package pk08;

public class Ex7_BankMain {

	public static void main(String[] args) {
		
		Ex7_Bank bk1=new Ex7_Bank("������", "02-111-2222");//������ ���� set
		Ex7_Bank.interest=0.2f;//����ƽ�̹Ƿ� Ŭ���� ����
		bk1.getBank(); //������ ������ ���
		
		System.out.println("----------------");
		
		Ex7_Bank bk2=new Ex7_Bank("�д���", "031-333-4444");
		bk2.getBank();//������ ������ ���
	}

}
