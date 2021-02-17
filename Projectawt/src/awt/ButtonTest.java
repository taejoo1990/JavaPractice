package awt;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	/*public static void main(String[] args) {

		Frame f = new Frame("버튼 테스트");
		f.setBounds(200, 200, 400, 400);
		
		f.setLayout(null);  //자동배치를 끈다.
		//그 순간 frame에 추가되는 각각의 컴포넌트는 고유의 size()와  
		//location()을 갖고 있어야 한다.
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 90, 100, 50);
		
		Button btnClose = new Button("닫기");	
		btnClose.setBounds(btnOk.getBounds());//btnOK와 같은 Bounds로 만든다
		
		
		//btnOK와 같은 Bounds라면 버튼 두개가 겹쳐져서 표시되므로
		//닫기버튼은 OK버튼의 오른쪽에 붙여 준다.
		btnClose.setLocation(btnOk.getWidth()+btnOk.getX() + 60, btnOk.getY());
		
		//버튼은 먼저 add할수록 화면 위쪽에 보여진다
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);

		//종료버튼 감지
		f.addWindowListener( new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		} );
	}
}*/
	
	public static void main(String[] args) {

		Frame f = new Frame();
		
		f.setBounds(800, 100, 1000, 500);
		f.setLayout( new FlowLayout() );
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		
		//FlowLayout에서의 버튼 크기 변경은 이렇게 해줘야 한다.
		//그냥 btn1.setSize(200, 100) 로는 변경 안됨
		btn1.setPreferredSize(new Dimension(200, 100));
		btn2.setPreferredSize(new Dimension(200, 100));
		btn3.setPreferredSize(new Dimension(200, 100));
		btn4.setPreferredSize(new Dimension(200, 100));
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		f.setVisible(true);
		
		//이벤트 감지자 등록
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);
		
		//종료버튼 감지
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
	
	static ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println( e.getActionCommand() ); //버튼에 부착되어 있는 제목
			
			//System.out.println(e);
			//System.out.println(e.getID());
			//System.out.println(  ((Button)e.getSource()).getWidth());
			
			//버튼에 부착되어 있는 제목을 통해 어떤 버튼이 클릭되었는지 구별
			if(e.getActionCommand().equals("1")){
				System.out.println("1번 눌렀음");
				
			}else if(e.getActionCommand().equals("2")){
				System.out.println("2번 눌렀음");
				
			}else if(e.getActionCommand().equals("3")){
				System.out.println("3번 눌렀음");
				
			}else if(e.getActionCommand().equals("4")){
				System.out.println("4번 눌렀음");
				
			}
			System.out.println("--------------------------------");	
		}
	};	
}
	
	
