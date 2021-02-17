package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFlowLayout {

	Frame f = new Frame(); // 패널 초기화 
	Button jb1 = new Button("버튼1"); // 버튼 초기화
	Button jb2 = new Button("버튼2"); // 버튼 초기화 
	Button jb3 = new Button("버튼3"); // 버튼 초기화 
	Button jb4 = new Button("버튼4"); // 버튼 초기화 
	Button jb5 = new Button("버튼5"); // 버튼 초기화 
	Button jb6 = new Button("버튼6"); // 버튼 초기화 

	public MyFlowLayout(){ 

		f.setLayout( new FlowLayout() ); //Frame을 FlowLayout으로 세팅 

		f.add(jb1); // jp라는 패널에 jb1라는 버튼 추가
		f.add(jb2); // jp라는 패널에 jb2라는 버튼 추가
		f.add(jb3); // jp라는 패널에 jb3라는 버튼 추가 
		f.add(jb4); // jp라는 패널에 jb4라는 버튼 추가 
		f.add(jb5); // jp라는 패널에 jb5라는 버튼 추가
		f.add(jb6); // jp라는 패널에 jb6라는 버튼 추가 
		
		f.setSize(400, 300); // 윈도우의 크기 가로x세로 
		f.setVisible(true); 

		f.addWindowListener( new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
	} //생성자

	public static void main(String[] args){ 
		new MyFlowLayout(); 
	} 
}