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
		//프레임 설정
		Frame frame=new Frame("문장 입력기");
		frame.setBounds(800,100,250,400);
		frame.setBackground(Color.GRAY);
		
		//폰트
		Font font=new Font(Font.SANS_SERIF,Font.PLAIN,18);
		
		//북쪽
		//컨포넌트를 하나로 묶어줌 Panel은 기본이 FlowLayout
		Panel pNorth=new Panel();
		pNorth.setBackground(Color.GREEN);
		

		TextField tf=new TextField(10);
		Button btn=new Button("입력");
		btn.setEnabled(false);
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		//중앙단
		TextArea ta=
				new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false);
		
		//남쪽단
		Panel pSouth=new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.MAGENTA);
		
		Button btnSave=new Button("저장");
		Button btnClose=new Button("종료");
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		frame.add(pNorth,BorderLayout.NORTH);
		frame.add(ta,BorderLayout.CENTER);
		frame.add(pSouth,BorderLayout.SOUTH);
		
		
		frame.add(pNorth,BorderLayout.NORTH);
		
		frame.setVisible(true);
		frame.setResizable(false);//창크기 고정
		
		//TextField에 값이 들어간 경우에만 입력버튼 활성화
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
		//TextField에서 문자 입력후 [Enter]치면 아래 TextArea에 내용 추가
		tf.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");
					
					//텍스트 비워주고 포커스
					tf.setText("");
					tf.requestFocus();
				}
			}
		});
		//TextField에서 문자 입력후[입력]버튼을 누르면 아래 TextArea에 내용 추가
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n");
				
				//텍스트 비워주고 포커스
				tf.setText("");
				tf.requestFocus();
			}
		});
		//닫기 버튼 클릭시 이벤트
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
		//저장
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String messge=ta.getText();
				
				try {
					//경로 잡기(대화상:FileDialog)
					FileDialog fd=new FileDialog(frame, "저장", FileDialog.SAVE);
					fd.setVisible(true);
					String path=fd.getDirectory()+fd.getFile();
					
					if(!messge.equals("")) {
						//스트링으로 path잡고 저장
						FileWriter fw=new FileWriter(path);
						BufferedWriter bw=new BufferedWriter(fw);
						
						bw.write(messge);
						
						//FileDialog 취소버튼을 누르지 않고 저장
						
						if(fd.getFile()!=null) {
							JOptionPane.showMessageDialog(frame, path+"\n경로에 저장이 완료 되었습니다.");
						}
						bw.close();
					}else {
						//TextArea에 기록 내용이 없다면
						JOptionPane.showMessageDialog(frame, "저장할 내용이 없습니다.");
					}
						
				} catch (IOException e2) {
					System.out.println(e2);
				}
			}
		});
		
	}//메인

}//클래스
