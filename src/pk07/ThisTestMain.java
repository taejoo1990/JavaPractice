package pk07;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		
		//�⺻ �����ڷ� ��ü�� ����� ��ü�� �̸��� R1
		ThisTest R1=new ThisTest();
		
		R1.Move();//�⺻�������� ��ü�̹Ƿ� speed�� 0���� ����ؼ� 20�� ����
		R1.Move();
		System.out.println("----------");
		R1.Age();//�⺻�������� ��ü�̹Ƿ� ���̰� 3�쿡�� �����ؼ� 2�쾿����
	//------------------------------
	
		int R_speed;
		int R_age;
		String R_name;
		String R_num;
		System.out.println("----------");
		R_speed=Integer.parseInt(JOptionPane.showInputDialog("�κ��ӵ�"));
		R_age=Integer.parseInt(JOptionPane.showInputDialog("�κ����꿬��"));
		R_name=JOptionPane.showInputDialog("�κ��̸�");
		R_num=JOptionPane.showInputDialog("��ǰ��ȣ");
		
		JOptionPane.showMessageDialog(null,"�κ��̸� : " +R_name+"\n�κ� ���꿬�� : "+R_age+"\n��ǰ��ȣ : "+R_num+"\n�ӵ� : "+R_speed);
		System.out.println("�κ��̸� : " +R_name+"\n�κ� ���꿬�� : "+R_age+"\n��ǰ��ȣ : "+R_num+"\n�ӵ� : "+R_speed);
		
		System.out.println("----------");
		R1.RName();
		R1.RNum();
		R1.Age();
		R1.Move();
		R1.Stop();
		
		
		
	}

}
