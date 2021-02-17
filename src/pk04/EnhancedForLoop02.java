package pk04;

import java.util.ArrayList;

public class EnhancedForLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Book> library=new ArrayList<Book>();
		
		library.add(new Book("태백산맥","조정례"));
		library.add(new Book("데미안","헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가","유시민"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("어린왕자","생텍쥐페리"));
		
		for(int i=0;i<library.size();i++) {
			Book book=library.get(i);
			book.showBookinfo();
		}
		System.out.println("-----------------");
		System.out.println("===향상된 for문 사용");
		for(Book book:library) {
			book.showBookinfo();
		}

	}

}
