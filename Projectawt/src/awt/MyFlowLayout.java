package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFlowLayout {

	Frame f = new Frame(); // �г� �ʱ�ȭ 
	Button jb1 = new Button("��ư1"); // ��ư �ʱ�ȭ
	Button jb2 = new Button("��ư2"); // ��ư �ʱ�ȭ 
	Button jb3 = new Button("��ư3"); // ��ư �ʱ�ȭ 
	Button jb4 = new Button("��ư4"); // ��ư �ʱ�ȭ 
	Button jb5 = new Button("��ư5"); // ��ư �ʱ�ȭ 
	Button jb6 = new Button("��ư6"); // ��ư �ʱ�ȭ 

	public MyFlowLayout(){ 

		f.setLayout( new FlowLayout() ); //Frame�� FlowLayout���� ���� 

		f.add(jb1); // jp��� �гο� jb1��� ��ư �߰�
		f.add(jb2); // jp��� �гο� jb2��� ��ư �߰�
		f.add(jb3); // jp��� �гο� jb3��� ��ư �߰� 
		f.add(jb4); // jp��� �гο� jb4��� ��ư �߰� 
		f.add(jb5); // jp��� �гο� jb5��� ��ư �߰�
		f.add(jb6); // jp��� �гο� jb6��� ��ư �߰� 
		
		f.setSize(400, 300); // �������� ũ�� ����x���� 
		f.setVisible(true); 

		f.addWindowListener( new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
	} //������

	public static void main(String[] args){ 
		new MyFlowLayout(); 
	} 
}