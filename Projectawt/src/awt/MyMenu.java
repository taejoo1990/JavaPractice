package awt;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//MyMenu 클래스 생성 및 내용 추가
public class MyMenu implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//클릭한 메뉴에 쓰여져 있는 텍스트를 구별하여 이벤트 처리
		if(e.getActionCommand().equals("프린트 셋업")){
			System.out.println("프린트 셋업");
			
		}else if(e.getActionCommand().equalsIgnoreCase("Close")){
			System.out.println("종료");
			System.exit(0);
		}
	}//actionPerformed()
}



//실행해서 프린트 셋업과 닫기버튼에 이벤트가 잘 적용됐는지 확인해보자.