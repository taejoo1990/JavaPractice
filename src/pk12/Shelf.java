package pk12;

import java.util.ArrayList;

public class Shelf {

	//ArrayList<String> ����
	protected ArrayList<String> shelf;//=new ArrayList<>()�����ҋ����� ���Բ� ������
													//���� �Ʒ�ó�� ����ž�
	//�����ڸ� ���ؼ� ArrayList<String>��ü�� �����ϴ°�
	public Shelf() {
		shelf=new ArrayList<String>();
	}//��̸���Ʈ�� shelf�� �����ٰž�
	
	//ArrayList<String>Ÿ���� shelf�迭 (��ü�� ����������) ��������
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}//��� ����Ʈ�� �� ������ �����ž�

}
