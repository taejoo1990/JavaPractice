package pk12;

public class BookShelfTest {

	public static void main(String[] args) {
		
		//has - A
		Queue qs=new BookShelf();
		//BookShelf bs=new BookShelf();
		qs.enQueue("�ո�");
		qs.enQueue("���");
		qs.enQueue("�丮��å");
		
		System.out.println("shelf�� ������ ����"+qs.getSize());
		
		System.out.println("shelf�� ������ ������"+qs.deQueue());
		System.out.println("shelf�� ������ ����"+qs.getSize());
		
		System.out.println("shelf�� ������ ������"+qs.deQueue());
		System.out.println("shelf�� ������ ������"+qs.deQueue());
		System.out.println("shelf�� ������ ����"+qs.getSize());
		
		
	}

}
