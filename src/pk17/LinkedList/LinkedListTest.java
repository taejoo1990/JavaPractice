package pk17.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myLink=new LinkedList<>();
		
		myLink.add("A");
		myLink.add("B");
		myLink.add("C");
		
		System.out.println(myLink);
		myLink.add(1, "D");
		System.out.println(myLink);
		
		myLink.addFirst("S");
		System.out.println(myLink);
		System.out.println(myLink.removeLast());
		System.out.println(myLink);
	}

}
