package pk05;

//Method Overloading
public class Method {
	
	//�ʵ�
	//������(�⺻������)
	
	// public�� ������ �����ϴ�
	void makeBread() {
		System.out.println("���� ��������ϴ�");
	}//method1 close

	void makeBread(int count) {

		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "��° ���� ���Խ��ϴ�");
		} // count���ڸ� �����ٰ��̱⿡ ������ ��� ���ص� ��
		System.out.println();
		System.out.println("��û�Ͻ�" + count + "���� ���� �ϼ��Ͽ����ϴ�.");
	}//method2 close

	void makeBread(int count, String name) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "��° " + name + " ���� ���Խ��ϴ�");
		}
		System.out.println();
		System.out.println("��û�Ͻ� " + count + " ���� " + name + "���� �ϼ��Ͽ����ϴ�.");
	}//method3 close

}//class close
