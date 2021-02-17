package pk12;

public class BookShelfTest {

	public static void main(String[] args) {
		
		//has - A
		Queue qs=new BookShelf();
		//BookShelf bs=new BookShelf();
		qs.enQueue("손맛");
		qs.enQueue("장맛");
		qs.enQueue("요리비책");
		
		System.out.println("shelf의 데이터 갯수"+qs.getSize());
		
		System.out.println("shelf의 삭제된 데이터"+qs.deQueue());
		System.out.println("shelf의 데이터 갯수"+qs.getSize());
		
		System.out.println("shelf의 삭제된 데이터"+qs.deQueue());
		System.out.println("shelf의 삭제된 데이터"+qs.deQueue());
		System.out.println("shelf의 데이터 갯수"+qs.getSize());
		
		
	}

}
