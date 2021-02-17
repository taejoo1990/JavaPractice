package pk07;

import javax.swing.JOptionPane;

public class Encapsulation1Main {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		String str="";
		
		Encapsulation1 e1=new Encapsulation1();
		
		side=Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		Area=e1.cal_Area(side, height);
		
		//용량을 줄이기 위해서는  Area를 사용하지않고 
		//System.out.println("사각형의 넓이는 : "+e1.cal_Area(side, height));
		//이런식으로 사용
		
		System.out.println("사각형의 넓이는 : "+Area);
		str="사각형의 넓이는 "+Area+"입니다.";
		JOptionPane.showMessageDialog(null, str);
	}

}
