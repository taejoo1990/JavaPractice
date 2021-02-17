package pk13;

import javax.swing.JOptionPane;

class Out{
	static int a=1;//객체생성없이 사용 가능 (독립적)
	int b;
	
	//inner class
	public static class In{
		
		String Infun() {
			int c=0;
			return(a+"번째 Static내부 클래스입니다.");
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
