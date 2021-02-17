package pk11;

//타입상속이지만 모두 구현이 완료되었으므로 추상클래스가 아니야
public class MyNoteBook extends NoteBook{
    //추상클래스에서 땡겨왔기에 타입상속이야
	//만약에 MyNoteBook에서 DeskTop을 상속 받았다면 ==> 구현상속
	
	@Override
	public void typing() {
		System.out.println("MyNoteBook Typing");
		
		
	}
	
	

}
