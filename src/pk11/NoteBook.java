package pk11;

//타입 상속 받았으나 하나는 사용하지 않았기에 추상클래스야
public abstract class NoteBook extends Computer{
	
	@Override
	public void display() {
		System.out.println("NoteBook Display.");
		
	}

}
