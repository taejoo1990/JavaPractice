package pk17.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest1 {
	
	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>();
		set.add("������");
		set.add("�ѽ¼�");
		set.add("������");
		
		System.out.println(set);
	}

}
