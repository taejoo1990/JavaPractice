package awt;

import javax.swing.JFrame;

public class FrameTest2 {

	public static void main(String[] args) {
		
		JFrame fr=new JFrame("두번째");
		fr.setSize(400,400);//사이즈
		fr.setLocation(800,100);//좌표
		
		//x버튼으로 프레임 닫기
		//프레임이 닫힐때 아예 메모리에서 없어지게 구현
		//JFRAME만 가능
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fr.setVisible(true);
		
		//fr.dispose();//여러개의 프레임중 원하는 프레임 하나만 닫을때 
	}

}
