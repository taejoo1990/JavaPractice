package pk17.Vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		//�뷮�� 2������ ����ǰ� ũ�Ⱑ �뷮�� ���� ������ ä�ﶧ���� �뷮�� �þ�� �ʴ´�
		
		
		Object obj;
		Vector<Object> vec=new Vector<>(1);
		obj=20201217;
		vec.addElement(obj);//������Ʈ �߰�
		//vector �뷮 ��
		System.out.println("�뷮��#1 : "+vec.capacity());
		//vector �ȿ� ����� ������Ʈ�� ��
		System.out.println("ũ���#1 : "+vec.size());
		System.out.println();

		obj="some people";
		vec.addElement(obj);//������Ʈ �߰�
		//vector �뷮 ��
		System.out.println("�뷮��#2 : "+vec.capacity());
		//vector �ȿ� ����� ������Ʈ�� ��
		System.out.println("ũ���#2 : "+vec.size());
		System.out.println();

		obj="drem of succss";
		vec.addElement(obj);//������Ʈ �߰�
		//vector �뷮 ��
		System.out.println("�뷮��#3 : "+vec.capacity());
		//vector �ȿ� ����� ������Ʈ�� ��
		System.out.println("ũ���#3 : "+vec.size());
		System.out.println();
		
		obj="while";
		vec.addElement(obj);//������Ʈ �߰�
		//vector �뷮 ��
		System.out.println("�뷮��#4 : "+vec.capacity());
		//vector �ȿ� ����� ������Ʈ�� ��
		System.out.println("ũ���#4 : "+vec.size());
		System.out.println();
		
		System.out.println(vec);
		
		
	}

}
