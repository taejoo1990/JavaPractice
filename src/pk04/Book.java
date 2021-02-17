package pk04;

public class Book {
	
	//필드=멤버변수
	private String bookname;
	private String author;
	
	//생성자
	public Book() {}
	
	public Book(String bookname, String author) {
		this.bookname=bookname;
		this.author=author;
		
	}

	
	//메소드
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookinfo() {
		System.out.println(bookname + ","+ author);
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", author=" + author + "]";
	}
	
	
}
