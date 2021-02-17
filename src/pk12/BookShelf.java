package pk12;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue{

	
	//ArrayList<String> shelf에 객체 추가
	@Override
	public void enQueue(String title) {
		//ArrayList<String> shelf=new ArrayList<String>();
		shelf.add(title);
	}//어레이 리스트에 title을 갔다 넣을거야

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}//어레이 리스트에 있는 자료를 삭제할거야

	@Override
	public int getSize() {
		return getCount();//가지고오는거
	}//어레이 리스트에 있는 자료 갯수를 세볼거야

}
