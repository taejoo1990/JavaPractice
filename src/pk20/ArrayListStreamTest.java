package pk20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList=new ArrayList<String>();
		sList.add("����");
		sList.add("�׸�");
		sList.add("���ο�");
		
		Stream<String> st=sList.stream();
		st.forEach(s->System.out.println(s+" "));
		System.out.println();

		//for��
		for(String s:sList) {
			System.out.println(s+" ");
		}
		System.out.println();
		
		System.out.println("====���� ��====");
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		//���ڰ������
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
										//key		  |		value
		//������ �������� ���
		sList.stream().filter(s->s.length()>=3).forEach(s->System.out.println(s));
		
	}

}
