package pk06;

import javax.swing.JOptionPane;

public class MyDataMain {

	public static void main(String[] args) {
		// ��ü ����(data)
		MyData date= new MyData();
		
		//�������=�Ӽ�=�ʵ��� �ʱ�ȭ
		date.year=2020;
		date.month=12;
		date.day=02;
		//���
		date.Disp(date.year, date.month, date.day);
		
	}

}
