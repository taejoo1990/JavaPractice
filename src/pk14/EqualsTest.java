package pk14;

public class EqualsTest {

	public static void main(String[] args) {

		
		//hashCode=�ֱ����ġ �ּ�
		Student studentLee=new Student(100, "������");//�Ʒ��� ���� �ٸ� �ּ�
		Student studentLee2=studentLee;
		Student studentHee=new Student(100, "������");
		//toString�� ����Ұ�� �ּҰ� �ƴ� �Է°��� ������ toString�� ������� ���� ���� �ּҰ� ����
		/*
		System.out.println(studentLee);
		System.out.println(studentLee2);
		System.out.println(studentHee);*/
		
		//������ �ּ��� �� �ν��Ͻ� ��
		System.out.println("������ �ּ��� �� �ν��Ͻ� ��");
		if(studentLee==studentLee2)
			System.out.println("studentLee�� �ּҴ� studentLee2�� �ּҿ� ����");
		else
			System.out.println("studentLee�� �ּҴ� studentLee2�� �ּҿ� �ٸ���");
	
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� �����ʹ� studentLee2�� ����");
		else
			System.out.println("studentLee�� �����ʹ� studentLee2�� �ٸ���");
		
		
		//�ּҴ� �ٸ��� �� �ν��Ͻ� ���� ����
		System.out.println("�ּҴ� �ٸ��� �� �ν��Ͻ� ���� ����");
		if (studentLee == studentHee)
			System.out.println("studentLee�� �ּҴ� studentHee�� �ּҿ� ����");
		else
			System.out.println("studentLee�� �ּҴ� studentHee�� �ּҿ� �ٸ���");

		if (studentLee.equals(studentHee))
			System.out.println("studentLee�� �����ʹ� studentHee�� ����");
		else
			System.out.println("studentLee�� �����ʹ� studentHee�� �ٸ���");
	
		//hashCode�� �� ���
		System.out.println("********hashCode�� �� ���*******");
		System.out.println("studentLee�� hashCode : "+studentLee.hashCode());
		System.out.println("studentHee��  hashCode : "+studentHee.hashCode());
		System.out.println();
		
		//hashCode�� ������ Ȯ���ϴ� �޼���
		System.out.println("********hashCode�� ������ Ȯ���ϴ� �޼���*******");
		System.out.println("studentLee�� ���� hashCode : "+System.identityHashCode(studentLee));
		System.out.println("studentHee�� ���� hashCode : "+System.identityHashCode(studentHee));
		System.out.println();
		
		String str1=new String("test");
		String str2=new String("test");//hashCode�� ������ �Ǿ� ����
		//hashCode�� ������ �Ǿ��ִ� String
		System.out.println("********hashCode�� ������ �Ǿ��ִ� String*******");
		System.out.println("studentLee�� ���� hashCode : "+str1.hashCode());
		System.out.println("studentHee�� ���� hashCode : "+str2.hashCode());
		System.out.println();
		
		
		//hashCode=�ֱ����ġ �ּ�
		
	
	}

}
