package pk11;

public class PhoneExample {

	public static void main(String[] args) {
		
		//���������� �ȵǰ� �ڽ��� ���ؼ� ������ �����ϵ���
		//Phone p=new Phone();//�߻�Ŭ������ ��ü�� ����� ���� �׷��Ƿ� ������ ȿ���� �ִ�
		
		SmartPhone sp=new SmartPhone("������");
		
		System.out.println(sp.owner+"���� ��");
		sp.turnOn();
		sp.internetsearch();
		sp.turnOff();
		

	}

}
