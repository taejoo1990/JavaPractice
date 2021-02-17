package pk17.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Comparator : Override�� Ŭ������ ������������ �������Ƿ� 
//������������ ������ �ϱ� ���� ����
//������� : 
//1. �ݵ�� �⺻�����ڰ� ���� �Ǿ� �־����
//2. hip�޸� ������ hip�޸𸮸� �ϳ� �� �����Ѵ�

class MyClass implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return (s1.compareTo(s2))*-1;//��������
		//return (s1.compareTo(s2));//��������
	}
	
}

public class ComparatorTest2 {
	
	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>(new MyClass());
		set.add("������");
		set.add("�ѽ¼�");
		set.add("������");
		
		System.out.println(set);
	}

}
