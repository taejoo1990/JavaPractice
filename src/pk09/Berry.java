package pk09;

public class Berry extends Fruit{
	//����Ŭ�������� ��ӹ����ž�
	private String size;
	private String name;
	
	public void set2(String a, String b) {
		name=a;
		size=b;
	}
	
	public void Disp2() {
		System.out.println("�̸� : "+name);
		System.out.println("ũ�� : "+size);
	}

}
