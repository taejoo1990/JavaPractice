package pk15;

public class A_03StBufferTest {

	public static void main(String[] args) {
		
		
		String str="";
		//String Buffer ��ü����
		StringBuffer buf=new StringBuffer("Nice Day! ");
		
		//StringBuffer ���ڿ��� String���� ��ȯ
		System.out.println(buf.toString());
		//StringBuffer ���ڿ��� ũ��(����)
		System.out.println(buf.length());//���� ���� (��������)
		//StringBuffer�� �뷮
		System.out.println(buf.capacity());
		//StringBuffer�� �뷮 ����(���� �ƽø� �뷮�� �ι迡 2�� ���ѰͰ� ����)
		buf.ensureCapacity(30);
		System.out.println(buf.capacity());
		//StringBuffer�� ���ο� ���ڿ� �߰�
		buf.insert(0, "Hi! ");
		buf.insert(14, "Everybody!");
		System.out.println(buf);
		//StringBuffer  ���ڿ��� �Ϻγ�������
		buf.delete(0, 4);
		System.out.println(buf);
		
	}

}
