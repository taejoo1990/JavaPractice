package pk17.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List구조를 갖는 ArrayList클래스의 객체 생성
		List<String> ls=new ArrayList<String>();
		//리스트에 데이터 추가
		ls.add("Hi! ");
		ls.add("Have ");
		ls.add("a Nice Day!");
	
		for (int i = 0; i < ls.size(); i++) 
			System.out.println(i+" : "+ls.get(i));
		System.out.println();
		System.out.println("====데이터 추가후====");
		ls.add(3,"Eveydody");
		for (int i = 0; i < ls.size(); i++)
			System.out.println((i+1)+" : "+ls.get(i));
		System.out.println("====데이터 삭제후====");
		ls.remove(0);
		for (int i = 0; i < ls.size(); i++)
			System.out.println((i+1)+" : "+ls.get(i));
	
	
	}

}
