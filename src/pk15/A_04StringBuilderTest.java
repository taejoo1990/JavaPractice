package pk15;

public class A_04StringBuilderTest {

	public static void main(String[] args) {
		
		String javaStr=new String("java");
		System.out.println("javaStr ���ڿ��� �ּ� : "+System.identityHashCode(javaStr));
		
		StringBuilder builder=new StringBuilder(javaStr);
		//String�� ���� StringBuilder��ü ����
		
		//Builder�� �޸� �ּ�
		System.out.println("���� �� Builder�� �޸� �ּ� : "+System.identityHashCode(builder));
		builder.append(" and");
		builder.append(" Python");
		builder.append(" Programming is Fun!!");
		System.out.println("���� �� Builder�� �޸� �ּ� : "+System.identityHashCode(builder));

		javaStr=builder.toString();//������ ��Ʈ������
		System.out.println(javaStr);
		System.out.println("javaStr ���ڿ��� �ּ� : "+System.identityHashCode(javaStr));
		//javaStr�� hip�޸��̱⿡ �ּҰ� ����
		
	}//��Ʈ������������� ���� ����߰��ص� ���� ��ġ�� �޸� �ּҰ� ��� ����
		//���� ������ó��
	//���۴� �ϳ��� ���� ��

}
