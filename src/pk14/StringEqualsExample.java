package pk14;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1=new String("�Ź�ö");//��ü
		
		String strVal2="�Ź�ö";//���ظ޸�(�Ϲ� ����)

		if(strVal1==strVal2) {
			System.out.println("���� String ��ü�� ����");
		}
		else {
			System.out.println("���� String ��ü�� ����");
		}
		
		//���� ������
		if(strVal1.equals(strVal2)) {
			System.out.println("���� String ��ü�� ����");
		}
		else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
	}
	
}
