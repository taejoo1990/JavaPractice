package pk07;

public class Person {
	
	String name;
	float height;
	float weight;
	
	//�⺻ ������
	public Person() {
		name="�͸�";
		height=0;
		weight=0;
	}
	
	//�̸��� ������
	public Person(String a) {
		name=a;
		height=0;
		weight=0;
	}
	
	//�̸� Ű �����԰� ��� ���õǴ� ������
	public Person(String a, int b, int c) {
		name=a;
		height=b;
		weight=c;
	}
	public void Disp() {
		System.out.println("�̸��� : "+name+"�Դϴ�");
		System.out.println("Ű�� : "+height+"cm�Դϴ�");
		System.out.println("�����Դ� : "+weight+"kg�Դϴ�");
		
	}

}
