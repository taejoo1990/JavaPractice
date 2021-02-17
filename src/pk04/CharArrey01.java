package pk04;

import javax.swing.JOptionPane;

public class CharArrey01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"ab111","cd222","ef333","ds444","kr555"};
		String res="";
		
		int i;
		for(i=0;i<str.length;i++)
			res+=str[i]+"\n";
		System.out.println(res);
		
		JOptionPane.showMessageDialog(null,"배열원소 값"+ "\n"+res);
		

	}

}
