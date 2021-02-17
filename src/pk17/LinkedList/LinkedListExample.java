package pk17.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for (int i = 0; i <10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간 : "+(endTime-startTime)+" ns");
		System.out.println("----------------------------------");
		
		
		startTime=System.nanoTime();
		for (int i = 0; i <10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList 걸린시간 : "+(endTime-startTime)+" ns");
		System.out.println("----------------------------------");
	}

}

/*toString과 valueOf 두 메서드 모두 Object 값을 String으로 반환하지만
 * 변경하고자 하는 Object가 null인 경우는
 * toString() 같은 경우 Null PointException(NPE)을 발생시키지만 
 * valueOf는"null"이라는 문자열로 처리하여 출력해준다.*/
