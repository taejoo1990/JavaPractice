package pk17.Vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		//용량은 2진수로 진행되고 크기가 용량을 같은 개수로 채울때까지 용량이 늘어나지 않는다
		
		
		Object obj;
		Vector<Object> vec=new Vector<>(1);
		obj=20201217;
		vec.addElement(obj);//엘리먼트 추가
		//vector 용량 수
		System.out.println("용량은#1 : "+vec.capacity());
		//vector 안에 저장된 엘리먼트의 수
		System.out.println("크기는#1 : "+vec.size());
		System.out.println();

		obj="some people";
		vec.addElement(obj);//엘리먼트 추가
		//vector 용량 수
		System.out.println("용량은#2 : "+vec.capacity());
		//vector 안에 저장된 엘리먼트의 수
		System.out.println("크기는#2 : "+vec.size());
		System.out.println();

		obj="drem of succss";
		vec.addElement(obj);//엘리먼트 추가
		//vector 용량 수
		System.out.println("용량은#3 : "+vec.capacity());
		//vector 안에 저장된 엘리먼트의 수
		System.out.println("크기는#3 : "+vec.size());
		System.out.println();
		
		obj="while";
		vec.addElement(obj);//엘리먼트 추가
		//vector 용량 수
		System.out.println("용량은#4 : "+vec.capacity());
		//vector 안에 저장된 엘리먼트의 수
		System.out.println("크기는#4 : "+vec.size());
		System.out.println();
		
		System.out.println(vec);
		
		
	}

}
