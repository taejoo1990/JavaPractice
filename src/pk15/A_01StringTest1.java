package pk15;

public class A_01StringTest1 {

	public static void main(String[] args) {
		//hip�޸𸮿� ��ü�� ����
		String str1=new String("abc");
		String str2=new String("abc");
		//�����ʹ� ������ �ּҰ� �ٸ���
		System.out.println(str1==str2);
		//������ ������ ��
		System.out.println(str1.equals(str2));
		//�ּҰ� ������ ��
		
		System.out.println();
		//���ڿ��� ��������� �����Ϳ����� ������ �ּ� ���(���Ǯ)
		//�Һ�(immutable)
		String str3="abc";
		String str4="abc";
		//�����Ϳ� �ּҰ� ����
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}

}
