package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest1 {

	public static void main(String[] args) {
		
		Frame frame=new Frame("��ư");
		//��ư��ü �迭�� �غ�
		Button[] arbtn=new Button[5];
		
		String[] btnTitles= {"�ݱ�","����","���","Ȯ��","�ȳ�"};
		
		for (int i = 0; i < arbtn.length; i++) {
			arbtn[i]=new Button(btnTitles[i]);
		}
		//Frame�� BorderLayout�� ���� ��ġ ������ �����ϴ�
		frame.add(arbtn[0],BorderLayout.EAST);
		frame.add(arbtn[1],BorderLayout.WEST);
		frame.add(arbtn[2],BorderLayout.SOUTH);
		frame.add(arbtn[3],BorderLayout.NORTH);
		frame.add(arbtn[4],BorderLayout.CENTER);
		
		//�����ӿ� ���빰�� ������ �� ���빰�� ���� ��ŭ�� ������ Ȯ���� ��
		frame.pack();
		frame.setVisible(true);
		
		//���ʿ� ��ġ�� �ݱ��ư ����
		arbtn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		//X��ư�� ������ ����
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			
		});
	}//main

}//class
