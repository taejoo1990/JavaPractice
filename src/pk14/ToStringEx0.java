package pk14;

import java.util.Date;

public class ToStringEx0 {

	public static void main(String[] args) {
		Object obj1=new Object();
		Date obj2=new Date();
		
		//�����ǰ� �ȵǾ� �ִ� �⺻
		System.out.println("obj1�� hash : "+obj1);
		System.out.println("Date�� ���� : "+obj2);
		System.out.println();
		
		//toString ������ �ϱ�
		System.out.println("obj1�� toString : "+obj1.toString());
		System.out.println("obj2�� toString : "+obj2.toString());
		

	}

}
