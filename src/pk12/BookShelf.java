package pk12;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue{

	
	//ArrayList<String> shelf�� ��ü �߰�
	@Override
	public void enQueue(String title) {
		//ArrayList<String> shelf=new ArrayList<String>();
		shelf.add(title);
	}//��� ����Ʈ�� title�� ���� �����ž�

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}//��� ����Ʈ�� �ִ� �ڷḦ �����Ұž�

	@Override
	public int getSize() {
		return getCount();//��������°�
	}//��� ����Ʈ�� �ִ� �ڷ� ������ �����ž�

}
