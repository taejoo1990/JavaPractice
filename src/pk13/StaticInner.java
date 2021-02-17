package pk13;

public class StaticInner {

	int a=10;
	private int b=100;
	static int c=200;
	
	//정적 내부 클래스
	static class InnerS{
		static int d=1000;
		
		public void gerDate() {
			System.out.println(c);//스테틱이라 가능
			System.out.println(d);
			
		}
	}
	
	
	public static void main(String[] args) {
		StaticInner.InnerS si=new StaticInner.InnerS();
		si.gerDate();
		
		InnerS s=new InnerS();
		s.gerDate();
		
	}

}
