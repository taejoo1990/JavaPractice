package pk13;

public class AMain {

	public static void main(String[] args) {
		A a=new A();
		
		//�ν��Ͻ� ���Ŭ����(innerClass) ��ü ����(�Ϲ� ����Ŭ����)
		A.B b=a.new B();
		//AŬ������B�� �� a��ü�� ���� b��ü�� ���ž�
		
		//���� ���Ŭ����(static)��ü ����
		A.C c=new A.C();
		//AŬ������C�� �� ����ƽ���־ �ٷ�c��ü�� �����Ұž� 
		
		//���� Ŭ���� ȣ��
		a.method();
	}

}
