package pk11;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1=new Computer(); //추상클래스는 객체를 만들수 없어
		Computer c2=new DeskTop();//구현상속
		//Computer c3=new NoteBook(); //추상클래스는 객체를 만들수 없어
		Computer c4=new MyNoteBook();//타입상속	
	}
	
}
