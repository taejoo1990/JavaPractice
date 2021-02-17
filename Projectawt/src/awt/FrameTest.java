package awt;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		
		Frame frame=new Frame("첫 프레임");//전체 프레임의 제목
		frame.setBounds(800,100,400,300);
		
		System.out.println(frame.getWidth());//double형
		System.out.println(frame.getHeight());//int형
		
		frame.setBackground(Color.BLUE);//배경색 지정
		
		frame.setVisible(true);//화면에 frame 보이게
		
		
		
	}

}
