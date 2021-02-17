package pk15;

public class A_06ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		A_05Person pe=new A_05Person();
		//����1(Class�� ��ü�� ���� Ŭ������ Ǯ������ �˰������)
		Class pClass1=pe.getClass();//Object Ÿ���� getClass()
		System.out.println("����1(getClass()) : "+pClass1.getName());
		System.out.println();
		
		//����2(Class�� ��ü�� ���� Ŭ������ Ǯ������ �˰������)
		Class pClass2=A_05Person.class;//class->getClass()���
		System.out.println("����2(class) : "+pClass2.getName());
		
		//����3 Ŭ���� �̸����� ��������
		//Ŭ���� �̸��� ��ġ���� ������� ClassNotFoundException �߻���
		Class pClass3=Class.forName("pk15.A_05Person");
		System.out.println("����3(forName) : "+pClass3.getName());
		
		
	}

}
