package pk06;

import javax.swing.JOptionPane;

public class MyDataMain {

	public static void main(String[] args) {
		// 객체 생성(data)
		MyData date= new MyData();
		
		//멤버변수=속성=필드의 초기화
		date.year=2020;
		date.month=12;
		date.day=02;
		//출력
		date.Disp(date.year, date.month, date.day);
		
	}

}
