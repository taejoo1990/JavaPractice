package awt;

import javax.swing.JFrame;

public class FrameTest2 {

	public static void main(String[] args) {
		
		JFrame fr=new JFrame("�ι�°");
		fr.setSize(400,400);//������
		fr.setLocation(800,100);//��ǥ
		
		//x��ư���� ������ �ݱ�
		//�������� ������ �ƿ� �޸𸮿��� �������� ����
		//JFRAME�� ����
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fr.setVisible(true);
		
		//fr.dispose();//�������� �������� ���ϴ� ������ �ϳ��� ������ 
	}

}
