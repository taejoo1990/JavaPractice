package pk09;

public class Main {

	public static void main(String[] args) {
		
		ChildExam c1=new ChildExam();
		
		//ChildŬ������ �ִ� getCarȣ��
		System.out.println(c1.getCar());
		
		//�ڽ��� �θ��� ����� ��� ��ӹ���
		//�θ�� ���� ��ӹ��� ���� ȣ��
		System.out.println(c1.getMoney());
		
		//Child=Parent (������ : instanceof)
		//������ ��ü�� �������� Ŭ������ �ν��Ͻ� ���������� Ȯ��
		if(c1 instanceof ParentExam)
			System.out.println("c1�� ParentExam�� �ڽ��̴�");
		
		System.out.println("------------------------------------------");
		
		ChildExam c2=new ChildExam();
		ParentExam p1=new ParentExam();
		
		//�ڽ��� �θ� ����
		//�ڽ��� �θ�� ĳ����
		//�θ� �ٽ� �ڽ����� ĳ����
		p1=(ParentExam)c2;//UPĳ����
		c2=(ChildExam)p1;//DOWNĳ����
		//�ڽĿ� �θ� �����ص� �ڽ��� �ڽ��� ����� �����ؼ� �θ��� ��� ����� ����� �� �ִ�
		System.out.println(c2.getCar());
		System.out.println(c2.getMoney());
		System.out.println(c2.getStr());
		System.out.println("-----------------------------");
		
		//�ݸ�
		p1=c2;//�θ��� �ڽ��� �����ص�
		//�θ��� ��ɸ� ����� �� �ִ�.
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		//System.out.println(p1.getCar());
		//�θ� �ڽ��� �޼ҵ鸦 ����ϰ� ������ �Ʒ�ó�� ĳ����
		System.out.println(((ChildExam)p1).getCar());
	}

}
