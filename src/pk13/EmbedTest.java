package pk13;

import javax.swing.JOptionPane;

class Out{
	static int a=1;//��ü�������� ��� ���� (������)
	int b;
	
	//inner class
	public static class In{
		
		String Infun() {
			int c=0;
			return(a+"��° Static���� Ŭ�����Դϴ�.");
		}
		
	}
	
}




public class EmbedTest {

	public static void main(String[] args) {
		String str="";
		Out.In obj=new Out.In();
		
		str=obj.Infun();
		JOptionPane.showMessageDialog(null, str+"\n success!");
		
	}

}
