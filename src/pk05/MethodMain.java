package pk05;

public class MethodMain {

	public static void main(String[] args) {
		//â���ϰ� ���� Ŭ������ �޸� ��ü�� ����(�⺻ ������ �̿�)
		Method mh=new Method();
		
		mh.makeBread();
		
		System.out.println("---------------");
		mh.makeBread(5);
		
		System.out.println("---------------");
		mh.makeBread(5, "�ҽ���");

	}

}
