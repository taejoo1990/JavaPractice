package pk04;

public class Book {
	
	//�ʵ�=�������
	private String bookname;
	private String author;
	
	//������
	public Book() {}
	
	public Book(String bookname, String author) {
		this.bookname=bookname;
		this.author=author;
		
	}

	
	//�޼ҵ�
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
