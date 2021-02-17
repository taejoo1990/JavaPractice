package awt;

import java.awt.Color;
import java.awt.event.WindowListener;

//FrameTest4클래스를 만들고 MyFrame을 객체화해 사용해보자.
public class FrameTest4 {
	public static void main(String[] args) {
		MyFrame fr = new MyFrame();
		fr.setBackground(Color.YELLOW);
		fr.setTitle("네번째 사용자 프레임");	
	}
}
