package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//Frame���� JLable�� ����� �̹��� ����
public class ImageTest {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setLayout(null);

		f.setBounds(500, 100, 500, 500);

		//�̹���
		ImageIcon img = new ImageIcon("������1.jpg");

		JLabel jl = new JLabel(img); //JLable���� ImageIcon�� �߰��� �� �ִ�.
		jl.setBounds(10, 30, 100, 100); //�����̹����� width, height�� ���ƾ� ��
		f.add(jl);

		f.setVisible(true);

		//x��ư �̺�Ʈ ����
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );

	}//main
}

