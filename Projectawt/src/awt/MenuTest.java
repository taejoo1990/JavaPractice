package awt;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {

	public static void main(String[] args) {
		//프레임에 메뉴를 붙이자
		Frame f = new Frame("메뉴");
		f.setSize(300,200);
		
		MenuBar mb = new MenuBar();
		
		Menu mFile = new Menu("파일");
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miSave = new MenuItem("Save");
		
		//하위메뉴를 가지고 있는 메뉴
		Menu print = new Menu("Print");
		MenuItem printSetup = new MenuItem("프린트 셋업");
		MenuItem printPre = new MenuItem("미리보기");
		
		print.add(printSetup);
		print.add(printPre);
		
		MenuItem miClose = new MenuItem("Close");
		
		 /* 응용편 
		 * mb.add(mFile);
		 */
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);
		
		//메뉴바에 메뉴 추가
		mb.add(mFile);
		
		//메뉴를 설정할 때는 add가 아닌 setMenuBar를 사용하여
		//만들어 놓은 메뉴를 세팅(교체)한다!!!
		f.setMenuBar(mb);
		f.setVisible(true);
		
		/* 응용편
		 * printSetup.addActionListener(new MyMenu()); miClose.addActionListener(new
		 * MyMenu());
		 */

		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}//main
}
