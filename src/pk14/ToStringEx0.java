package pk14;

import java.util.Date;

public class ToStringEx0 {

	public static void main(String[] args) {
		Object obj1=new Object();
		Date obj2=new Date();
		
		//재정의가 안되어 있는 기본
		System.out.println("obj1의 hash : "+obj1);
		System.out.println("Date의 원형 : "+obj2);
		System.out.println();
		
		//toString 재정의 하기
		System.out.println("obj1의 toString : "+obj1.toString());
		System.out.println("obj2의 toString : "+obj2.toString());
		

	}

}
