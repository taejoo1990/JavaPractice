package pk07;


class Person2{
	//�ʵ�
	String name;
	int age;
	
	public Person2() {//Person2(String name, int age)
		this("�̸�����",1);//�������� ȣ��
	}//���⼭ �𽺴� �� ���� �ٸ� �����ڸ� ������� ��
	//�⺻���� ���ϰ� ���
	
	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
	}//�⺻���� ������ ���
	Person2 returnSelf() {
		return this; //Person2�� ���� �⺻�����ڸ� �о�
	}

}

public class CallAnotherConst {
	
	public static void main(String[] args) {
		Person2 noname=new Person2();
		System.out.print(noname.name+", ");
		System.out.print(noname.age);
		
		System.out.println();
		Person2 p=noname.returnSelf();
		System.out.print(p.name+", ");
		System.out.print(p.age);

	}

}
