package pk06;

import javax.swing.JOptionPane;

public class SungJuk {
	//필드
	private String Std_num;
	private String Std_name;
	private int Java, Python, R;
	//private같은 경우는 같은 클래스 내에서는 사용 가능하지만 다른 클래스에서 참조할수 없다
	//StudentInfoTest참조
	//생성자(기본 생성자)
	//public SungJuk() {};
	
	//메소드
	public void Sum() {
		System.out.println("총 점 : " + (Java+Python+R)+" 점 입니다");

	}
	
	public void Avg() {
		System.out.println("평 균 : " + (Java+Python+R)/3+" 점 입니다");
		
	}
	
	public static void main(String[] args) {
		SungJuk rec=new SungJuk(); //객체 생성
		//멤버변수 참조
		rec.Std_num=JOptionPane.showInputDialog("학번");
		//클래스 jungjuk에 접근할 수 있는 rec를 통해서
		//클래스 sungjuk에 있는 변수(int) std_num을 가져와,
		//stunum은 jop을 통해서 "학번"이라는 메세지를 보여주어서
		//사용자에게 숫자를 받을거야.
		rec.Std_name=JOptionPane.showInputDialog("성명");
		rec.Java=Integer.parseInt(JOptionPane.showInputDialog("Java"));
		rec.Python=Integer.parseInt(JOptionPane.showInputDialog("Python"));
		rec.R=Integer.parseInt(JOptionPane.showInputDialog("R"));
		
		System.out.println(rec.Std_num+" , "+rec.Std_name+"의 성적입니다.");
		//메소드를 참조
		rec.Sum();
		rec.Avg();
		
	
	}

}
