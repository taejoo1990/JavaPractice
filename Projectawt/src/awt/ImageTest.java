package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//Frame에서 JLable을 사용해 이미지 띄우기
public class ImageTest {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setLayout(null);

		f.setBounds(500, 100, 500, 500);

		//이미지
		ImageIcon img = new ImageIcon("개구리1.jpg");

		JLabel jl = new JLabel(img); //JLable에만 ImageIcon을 추가할 수 있다.
		jl.setBounds(10, 30, 100, 100); //원본이미지의 width, height과 같아야 함
		f.add(jl);

		f.setVisible(true);

		//x버튼 이벤트 감지
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );

	}//main
}

