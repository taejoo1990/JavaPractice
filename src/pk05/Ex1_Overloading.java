package pk05;

public class Ex1_Overloading {
	
	//�ʵ����
	//������
	//�޼ҵ�(Overloading) : '�ߺ�����' �ϳ��� Ŭ������ ������ �̸��� �޼ҵ尡 ����
	//Overloading(������): �������� ������ ȿ���� �ش�ȭ	  //�Ű������� �ٸ��� �Ѵ�.
	public void getResult(int n) {
		System.out.println(n + "��(��) int �Դϴ�.");
	}
	
	public void getResult(char n) {
		System.out.println(n + "��(��) char �Դϴ�.");
	}
	
	public void getResult(String n) {
		System.out.println(n + "��(��) String �Դϴ�.");
	}
	
	public void getResult(int n, String str) {
		System.out.println(n + "��(��) int " + str + "��(��) String");
	}

}
