package pk07;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		
		//기본 생성자로 객체를 만들되 객체의 이름은 R1
		ThisTest R1=new ThisTest();
		
		R1.Move();//기본생성자의 객체이므로 speed가 0에서 출발해서 20씩 증가
		R1.Move();
		System.out.println("----------");
		R1.Age();//기본생성자의 객체이므로 나이가 3살에서 시작해서 2살씩증가
	//------------------------------
	
		int R_speed;
		int R_age;
		String R_name;
		String R_num;
		System.out.println("----------");
		R_speed=Integer.parseInt(JOptionPane.showInputDialog("로봇속도"));
		R_age=Integer.parseInt(JOptionPane.showInputDialog("로봇생산연도"));
		R_name=JOptionPane.showInputDialog("로봇이름");
		R_num=JOptionPane.showInputDialog("제품번호");
		
		JOptionPane.showMessageDialog(null,"로봇이름 : " +R_name+"\n로봇 생산연도 : "+R_age+"\n제품번호 : "+R_num+"\n속도 : "+R_speed);
		System.out.println("로봇이름 : " +R_name+"\n로봇 생산연도 : "+R_age+"\n제품번호 : "+R_num+"\n속도 : "+R_speed);
		
		System.out.println("----------");
		R1.RName();
		R1.RNum();
		R1.Age();
		R1.Move();
		R1.Stop();
		
		
		
	}

}
