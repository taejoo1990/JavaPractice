package awt;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//MyMenu Ŭ���� ���� �� ���� �߰�
public class MyMenu implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//Ŭ���� �޴��� ������ �ִ� �ؽ�Ʈ�� �����Ͽ� �̺�Ʈ ó��
		if(e.getActionCommand().equals("����Ʈ �¾�")){
			System.out.println("����Ʈ �¾�");
			
		}else if(e.getActionCommand().equalsIgnoreCase("Close")){
			System.out.println("����");
			System.exit(0);
		}
	}//actionPerformed()
}



//�����ؼ� ����Ʈ �¾��� �ݱ��ư�� �̺�Ʈ�� �� ����ƴ��� Ȯ���غ���.