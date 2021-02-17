package pk17.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// ArrayList�� �⺻ �뷮�� 10�������� size()�� �þ�� �پ��� ����
		
		ArrayList<Integer> list=new ArrayList<>();//10���� ������Ʈ
		System.out.println("list.size() : "+list.size());
		
		list.add(100);
		list.add(20);
		System.out.println();
		System.out.println("list.size() : "+list.size());
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		//�ε����� �����ϴ� ������ ���̰� ������ �ӵ��� ������
		//�װ��� �ذ��ϱ� ���ؼ� ���� ���� Iterator�̴�.
		
		//1)List������ �ڿ��� �ݺ��ڷ� ��ȯ�ϴ�
		Iterator<Integer> it=list.iterator();
		
		//2)�ݺ��ڸ� �ݺ������� ����
		while(it.hasNext()) {//�ݺ��� �ȿ��� Ŀ���� �����ϸ�
			int v=it.next();//Integer-> int (unBoxing)
			System.out.println(v);
			
		}
	}

}
