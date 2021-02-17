package awt;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest2 {
	public static void main(String[] args) {
		Frame f = new Frame("질문");
		
		f.setBounds(400, 100, 500, 250);		
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("지역선택");
		day.add("서울");
		day.add("경기");
		day.add("인천");
		day.add("광주");
		day.add("대구");
		day.add("대전");
		day.add("부산");
		
		//사이즈를 설정하려면 자동배치를 꺼야한다. 현재 크기가 반영된다.
		//높이는 안에있는 요소의 사이즈로 결정되므로 크게 의미가 없다.
		day.setSize(100, 0);
		day.setLocation(50, 100);
		
		day.addItemListener( new ChoiceHandler() );
		
		f.add(day);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
}
