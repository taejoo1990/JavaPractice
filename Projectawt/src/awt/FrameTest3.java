package awt;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.PrintJob;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.datatransfer.Clipboard;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.peer.DragSourceContextPeer;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.peer.ButtonPeer;
import java.awt.peer.CanvasPeer;
import java.awt.peer.CheckboxMenuItemPeer;
import java.awt.peer.CheckboxPeer;
import java.awt.peer.ChoicePeer;
import java.awt.peer.DesktopPeer;
import java.awt.peer.DialogPeer;
import java.awt.peer.FileDialogPeer;
import java.awt.peer.FontPeer;
import java.awt.peer.FramePeer;
import java.awt.peer.LabelPeer;
import java.awt.peer.ListPeer;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import java.awt.peer.PanelPeer;
import java.awt.peer.PopupMenuPeer;
import java.awt.peer.ScrollPanePeer;
import java.awt.peer.ScrollbarPeer;
import java.awt.peer.TextAreaPeer;
import java.awt.peer.TextFieldPeer;
import java.awt.peer.WindowPeer;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

public class FrameTest3 {

	public static void main(String[] args) {
		/*
		화면 중앙에 프레임 위치 시키디
		1.실행 중인 모니터의 해상도를 알아야한다..
		2.모니터의 중앙 좌표를 알아놓은 후,
		3.프레임 좌우 크기를 중앙 좌표에서 빼줘야한다.
		
		awt.Toolkit  <--싱글턴
			  Toolkit		beep()
			  				get모니터사이즈()		<==!!!	width		height  값!@
			  				
			  x : 모니터 중앙 좌표값 - 	내가 만들려는 프레임의width/2
			  y : 모니터 중앙 좌표값 - 	내가 만들려는 프레임의heidth/2
		*/
		Frame fr=new Frame("해상도");
		fr.setSize(400,400);
		//Toolkit 객체
		Toolkit tk=Toolkit.getDefaultToolkit();
		//beep을 출력
		for (int i=0;i<3; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			tk.beep();
		}		
		//Toolkit 해상도 얻어오기
		Dimension di=tk.getScreenSize();
		int moniterW=di.width;
		int moniterH=di.height;
		
		int x=moniterW/2-fr.getWidth()/2;
		int y=moniterH/2-fr.getHeight()/2;
		
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
		fr.setLocation(x, y);
		fr.setVisible(true);
	}

}
