package awt;

import java.awt.event.WindowEvent;

//WinClosingListener�� �����ؼ� ListenerClass�� ��ӹް�, windowClosing()�޼��带 ����������
public class WinClosingListener extends ListenerClass{

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�����ư�� �������� �������� �����Ŵ�!!");
	}
}

