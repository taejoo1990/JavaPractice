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
		
		Frame frame=new Frame("버튼");
		//버튼객체 배열로 준비
		Button[] arbtn=new Button[5];
		
		String[] btnTitles= {"닫기","열기","취소","확인","안녕"};
		
		for (int i = 0; i < arbtn.length; i++) {
			arbtn[i]=new Button(btnTitles[i]);
		}
		//Frame도 BorderLayout과 같이 위치 선정이 가능하다
		frame.add(arbtn[0],BorderLayout.EAST);
		frame.add(arbtn[1],BorderLayout.WEST);
		frame.add(arbtn[2],BorderLayout.SOUTH);
		frame.add(arbtn[3],BorderLayout.NORTH);
		frame.add(arbtn[4],BorderLayout.CENTER);
		
		//프레임에 내용물이 있으면 그 내용물의 내용 만큼만 영역을 확보해 줌
		frame.pack();
		frame.setVisible(true);
		
		//동쪽에 위치한 닫기버튼 구현
		arbtn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		//X버튼을 누를때 종료
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			
		});
	}//main

}//class
