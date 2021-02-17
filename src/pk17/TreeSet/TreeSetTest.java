package pk17.TreeSet;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("ÀÌÅÂÁÖ");
		treeSet.add("ÇÑ½Â¼ö");
		treeSet.add("À±±ÙÇõ");
		
		for(String str:treeSet) {
			System.out.println(str);
		}
		
	}

}
