package pk17.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest1 {
	
	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>();
		set.add("ÀÌÅÂÁÖ");
		set.add("ÇÑ½Â¼ö");
		set.add("À±±ÙÇõ");
		
		System.out.println(set);
	}

}
