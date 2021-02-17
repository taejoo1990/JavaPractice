package pk14;

class BK{
	
	int bookNumber;
	String bookTitle;
	
	BK(int bookNumber, String bookTitle) {
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}

	@Override
	public String toString() {
		//return super.toString();
		return bookNumber +", "+bookTitle;
	}
	
}


public class ToStringEx1 {

	public static void main(String[] args) {
		BK book1=new BK(200,"∞≥πÃ");
		
		System.out.println("BK¿« ∞¥√º : "+book1);
		System.out.println("BK¿« ∞¥√º : "+book1.toString());
		
		System.out.println("------------------------");
		
		String str=new String("test");
		System.out.println("String¿« ∞¥√º : "+str);

	}

}
