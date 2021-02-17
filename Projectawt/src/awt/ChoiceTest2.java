package awt;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest2 {
	public static void main(String[] args) {
		Frame f = new Frame("����");
		
		f.setBounds(400, 100, 500, 250);		
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("��������");
		day.add("����");
		day.add("���");
		day.add("��õ");
		day.add("����");
		day.add("�뱸");
		day.add("����");
		day.add("�λ�");
		
		//����� �����Ϸ��� �ڵ���ġ�� �����Ѵ�. ���� ũ�Ⱑ �ݿ��ȴ�.
		//���̴� �ȿ��ִ� ����� ������� �����ǹǷ� ũ�� �ǹ̰� ����.
		day.setSize(100, 0);
		day.setLocation(50, 100);
		
		day.addItemListener( new ChoiceHandler() );
		
		f.add(day);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
}
