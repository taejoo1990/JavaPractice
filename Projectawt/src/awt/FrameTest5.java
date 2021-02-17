package awt;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*public class FrameTest5 {
	public static void main(String[] args) {
		
		MyFrame fr = new MyFrame();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("�ټ���° ����� ������");

		//�����ӿ���  _ X �� �ش��ϴ� �̺�Ʈ�� �����ڸ� ����Ѵ�
		//�� �����ڴ� WindowListener�� �����ϰ� �ִ� MyEventListenerŬ���� �̴�.
		fr.addWindowListener( new MyEventListener() ); 
	}
}*/

public class FrameTest5 {

public static void main(String[] args) {
	MyFrame fr = new MyFrame();
	fr.setBackground(Color.YELLOW);
	fr.setTitle("�ټ���° ����� ������");

//�����ӿ���  _ X �� �ش��ϴ� �̺�Ʈ�� �����ڸ� ����Ѵ�
//�� �����ڴ� WindowListener�� �����ϰ� �ִ� MyEventListenerŬ���� �̴�.
//fr.addWindowListener( new MyEventListener() ); 
				
//fr.addWindowListener( new WinClosingListener() );

//�͸����� �����ڸ� �ٷ� �ٿ��� ����ϴ� ���
fr.addWindowListener( new WindowAdapter(){
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("����͸� �����Ͽ� ����!!");
	}
} );
}
}