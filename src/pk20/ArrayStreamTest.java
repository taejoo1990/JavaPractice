package pk20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr [i]+" ");
		}
		System.out.println();
		
		Arrays.stream(arr).forEach(n->System.out.print(n+" "));
		
		System.out.println();
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		
		System.out.println("====ArrayList====");
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.stream().forEach(s->System.out.print(s+" "));
		
		System.out.println();
		int sum2=list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println(sum2);
	}

}
