package awt;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		
		Frame frame=new Frame("ù ������");//��ü �������� ����
		frame.setBounds(800,100,400,300);
		
		System.out.println(frame.getWidth());//double��
		System.out.println(frame.getHeight());//int��
		
		frame.setBackground(Color.BLUE);//���� ����
		
		frame.setVisible(true);//ȭ�鿡 frame ���̰�
		
		
		
	}

}
