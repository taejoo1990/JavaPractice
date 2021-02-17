package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


public class Framepoint {

	public static void main(String[] args) {
		//������ ����
		Frame frame=new Frame("���� �Է±�");
		frame.setBounds(800,100,250,400);
		frame.setBackground(Color.GRAY);
		
		//��Ʈ
		Font font=new Font(Font.SANS_SERIF,Font.PLAIN,18);
		
		//����
		//������Ʈ�� �ϳ��� ������ Panel�� �⺻�� FlowLayout
		Panel pNorth=new Panel();
		pNorth.setBackground(Color.GREEN);
		

		TextField tf=new TextField(10);
		Button btn=new Button("�Է�");
		btn.setEnabled(false);
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		//�߾Ӵ�
		TextArea ta=
				new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false);
		
		//���ʴ�
		Panel pSouth=new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.MAGENTA);
		
		Button btnSave=new Button("����");
		Button btnClose=new Button("����");
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		frame.add(pNorth,BorderLayout.NORTH);
		frame.add(ta,BorderLayout.CENTER);
		frame.add(pSouth,BorderLayout.SOUTH);
		
		
		frame.add(pNorth,BorderLayout.NORTH);
		
		frame.setVisible(true);
		frame.setResizable(false);//âũ�� ����
		
		//TextField�� ���� �� ��쿡�� �Է¹�ư Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
					
				}
				
			}
		});
		//TextField���� ���� �Է��� [Enter]ġ�� �Ʒ� TextArea�� ���� �߰�
		tf.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");
					
					//�ؽ�Ʈ ����ְ� ��Ŀ��
					tf.setText("");
					tf.requestFocus();
				}
			}
		});
		//TextField���� ���� �Է���[�Է�]��ư�� ������ �Ʒ� TextArea�� ���� �߰�
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n");
				
				//�ؽ�Ʈ ����ְ� ��Ŀ��
				tf.setText("");
				tf.requestFocus();
			}
		});
		//�ݱ� ��ư Ŭ���� �̺�Ʈ
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//����
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String messge=ta.getText();
				
				try {
					//��� ���(��ȭ��:FileDialog)
					FileDialog fd=new FileDialog(frame, "����", FileDialog.SAVE);
					fd.setVisible(true);
					String path=fd.getDirectory()+fd.getFile();
					
					if(!messge.equals("")) {
						//��Ʈ������ path��� ����
						FileWriter fw=new FileWriter(path);
						BufferedWriter bw=new BufferedWriter(fw);
						
						bw.write(messge);
						
						//FileDialog ��ҹ�ư�� ������ �ʰ� ����
						
						if(fd.getFile()!=null) {
							JOptionPane.showMessageDialog(frame, path+"\n��ο� ������ �Ϸ� �Ǿ����ϴ�.");
						}
						bw.close();
					}else {
						//TextArea�� ��� ������ ���ٸ�
						JOptionPane.showMessageDialog(frame, "������ ������ �����ϴ�.");
					}
						
				} catch (IOException e2) {
					System.out.println(e2);
				}
			}
		});
		
	}//����

}//Ŭ����
