package pk03;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int JumSu;//파스칼 기법
		char HakJum;
		
		JumSu=Integer.parseInt(JOptionPane.showInputDialog("점수 입력"));
		
		if(JumSu>=90)
			HakJum='A';
		else if(JumSu>=80)
			HakJum='B';
		else if(JumSu>=70)
			HakJum='C';
		else if(JumSu>=60)
			HakJum='D';
		else
			HakJum='F';
		
		System.out.println("취득한 학점은" + HakJum +"입니다");

	}

}
