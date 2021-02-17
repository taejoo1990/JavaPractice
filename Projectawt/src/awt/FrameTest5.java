package awt;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*public class FrameTest5 {
	public static void main(String[] args) {
		
		MyFrame fr = new MyFrame();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("다섯번째 사용자 프레임");

		//프레임에서  _ X 에 해당하는 이벤트를 감지자를 등록한다
		//이 감지자는 WindowListener를 구현하고 있는 MyEventListener클래스 이다.
		fr.addWindowListener( new MyEventListener() ); 
	}
}*/

public class FrameTest5 {

public static void main(String[] args) {
	MyFrame fr = new MyFrame();
	fr.setBackground(Color.YELLOW);
	fr.setTitle("다섯번째 사용자 프레임");

//프레임에서  _ X 에 해당하는 이벤트를 감지자를 등록한다
//이 감지자는 WindowListener를 구현하고 있는 MyEventListener클래스 이다.
//fr.addWindowListener( new MyEventListener() ); 
				
//fr.addWindowListener( new WinClosingListener() );

//익명으로 감지자를 바로 붙여서 사용하는 방법
fr.addWindowListener( new WindowAdapter(){
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("어댑터를 생성하여 감지!!");
	}
} );
}
}