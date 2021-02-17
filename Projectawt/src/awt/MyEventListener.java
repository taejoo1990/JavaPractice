package awt;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//WindowListener를 구현하는 MyEventListener클래스 생성
public class MyEventListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) { }

	@Override
	public void windowClosed(WindowEvent e) { }

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x버튼을 클릭함");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) { }

	


	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("원래대로 돌아옴");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 됨");
	}

	@Override
	public void windowOpened(WindowEvent e) { }
}
