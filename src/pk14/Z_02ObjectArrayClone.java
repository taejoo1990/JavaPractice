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
		
		MyBook book1=new MyBook("�ڹ�");
		MyBook book2=new MyBook("���̽�");
		MyBook book3=new MyBook("�ΰ�����");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		System.out.println(bookList);
		
		System.out.println("=================");
		ArrayList<MyBook> copyList=(ArrayList)bookList.clone();
		copyList.add(new MyBook("C++"));
		
		System.out.println("copy���� �ٲ㵵 ������ ������ ����.");
		System.out.println(copyList);
		
		System.out.println("-------------------------------");
		System.out.println("������ �����Ǹ� copy���� ������");
		book3.setTitle("C���");
		System.out.println(bookList);
		System.out.println(copyList);
		
	}

}
