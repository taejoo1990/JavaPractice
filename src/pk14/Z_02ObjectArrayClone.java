package pk14;

import java.util.ArrayList;

class MyBook implements Cloneable{

	String title;
	
	public MyBook(String title) {
		this.title=title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class Z_02ObjectArrayClone {

	public static void main(String[] args) {
		
		ArrayList<MyBook> bookList=new ArrayList<MyBook>();
		
		MyBook book1=new MyBook("자바");
		MyBook book2=new MyBook("파이썬");
		MyBook book3=new MyBook("인공지능");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		System.out.println(bookList);
		
		System.out.println("=================");
		ArrayList<MyBook> copyList=(ArrayList)bookList.clone();
		copyList.add(new MyBook("C++"));
		
		System.out.println("copy본은 바꿔도 원본에 영향이 없다.");
		System.out.println(copyList);
		
		System.out.println("-------------------------------");
		System.out.println("원본이 수정되면 copy본도 수정됨");
		book3.setTitle("C언어");
		System.out.println(bookList);
		System.out.println(copyList);
		
	}

}
