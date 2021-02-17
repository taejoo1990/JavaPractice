package pk20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList=new ArrayList<String>();
		sList.add("레드");
		sList.add("그린");
		sList.add("옐로우");
		
		Stream<String> st=sList.stream();
		st.forEach(s->System.out.println(s+" "));
		System.out.println();

		//for문
		for(String s:sList) {
			System.out.println(s+" ");
		}
		System.out.println();
		
		System.out.println("====정렬 후====");
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		//글자갯수출력
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
										//key		  |		value
		//정해진 조건으로 출력
		sList.stream().filter(s->s.length()>=3).forEach(s->System.out.println(s));
		
	}

}
