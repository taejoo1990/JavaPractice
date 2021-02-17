package pk12;

import java.util.ArrayList;

public class Shelf {

	//ArrayList<String> 선언
	protected ArrayList<String> shelf;//=new ArrayList<>()생성할떄마다 들어가게끔 설정을
													//위해 아래처럼 만든거야
	//생성자를 통해서 ArrayList<String>객체가 생성하는겨
	public Shelf() {
		shelf=new ArrayList<String>();
	}//어레이리스트를 shelf에 방을줄거야
	
	//ArrayList<String>타입의 shelf배열 (객체를 생성했으니) 가져오자
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}//어레이 리스트에 들어간 갯수를 세볼거야

}
