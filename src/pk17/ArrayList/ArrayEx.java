package pk17.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// ArrayList는 기본 용량은 10개이지만 size()로 늘어났다 줄었다 가능
		
		ArrayList<Integer> list=new ArrayList<>();//10개의 엘리먼트
		System.out.println("list.size() : "+list.size());
		
		list.add(100);
		list.add(20);
		System.out.println();
		System.out.println("list.size() : "+list.size());
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		//인덱스로 접근하는 구조는 깊이가 있으면 속도가 느려짐
		//그것을 해결하기 위해서 나온 개념 Iterator이다.
		
		//1)List구조의 자원을 반복자로 변환하다
		Iterator<Integer> it=list.iterator();
		
		//2)반복자를 반복문으로 수행
		while(it.hasNext()) {//반복자 안에는 커서가 존재하며
			int v=it.next();//Integer-> int (unBoxing)
			System.out.println(v);
			
		}
	}

}
