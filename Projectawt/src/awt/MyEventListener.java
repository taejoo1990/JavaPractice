package awt;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//WindowListener�� �����ϴ� MyEventListenerŬ���� ����
public class MyEventListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) { }

	@Override
	public void windowClosed(WindowEvent e) { }

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x��ư�� Ŭ����");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) { }

	


	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("������� ���ƿ�");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ ��");
	}

	@Override
	public void windowOpened(WindowEvent e) { }
}
