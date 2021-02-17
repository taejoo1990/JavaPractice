package awt;

import java.awt.event.WindowEvent;

//WinClosingListener를 생성해서 ListenerClass를 상속받고, windowClosing()메서드를 재정의하자
public class WinClosingListener extends ListenerClass{

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료버튼은 눌렀지만 종료하진 않을거다!!");
	}
}

