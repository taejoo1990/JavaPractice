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

		Frame f = new Frame("��ư �׽�Ʈ");
		f.setBounds(200, 200, 400, 400);
		
		f.setLayout(null);  //�ڵ���ġ�� ����.
		//�� ���� frame�� �߰��Ǵ� ������ ������Ʈ�� ������ size()��  
		//location()�� ���� �־�� �Ѵ�.
		Button btnOk = new Button("Ȯ��");
		btnOk.setBounds(70, 90, 100, 50);
		
		Button btnClose = new Button("�ݱ�");	
		btnClose.setBounds(btnOk.getBounds());//btnOK�� ���� Bounds�� �����
		
		
		//btnOK�� ���� Bounds��� ��ư �ΰ��� �������� ǥ�õǹǷ�
		//�ݱ��ư�� OK��ư�� �����ʿ� �ٿ� �ش�.
		btnClose.setLocation(btnOk.getWidth()+btnOk.getX() + 60, btnOk.getY());
		
		//��ư�� ���� add�Ҽ��� ȭ�� ���ʿ� ��������
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);

		//�����ư ����
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
		
		//FlowLayout������ ��ư ũ�� ������ �̷��� ����� �Ѵ�.
		//�׳� btn1.setSize(200, 100) �δ� ���� �ȵ�
		btn1.setPreferredSize(new Dimension(200, 100));
		btn2.setPreferredSize(new Dimension(200, 100));
		btn3.setPreferredSize(new Dimension(200, 100));
		btn4.setPreferredSize(new Dimension(200, 100));
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		f.setVisible(true);
		
		//�̺�Ʈ ������ ���
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);
		
		//�����ư ����
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
			
			System.out.println( e.getActionCommand() ); //��ư�� �����Ǿ� �ִ� ����
			
			//System.out.println(e);
			//System.out.println(e.getID());
			//System.out.println(  ((Button)e.getSource()).getWidth());
			
			//��ư�� �����Ǿ� �ִ� ������ ���� � ��ư�� Ŭ���Ǿ����� ����
			if(e.getActionCommand().equals("1")){
				System.out.println("1�� ������");
				
			}else if(e.getActionCommand().equals("2")){
				System.out.println("2�� ������");
				
			}else if(e.getActionCommand().equals("3")){
				System.out.println("3�� ������");
				
			}else if(e.getActionCommand().equals("4")){
				System.out.println("4�� ������");
				
			}
			System.out.println("--------------------------------");	
		}
	};	
}
	
	
