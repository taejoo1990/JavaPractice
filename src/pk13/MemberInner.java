package pk13;

public class MemberInner {


		int a=10;
		private int b=100;
		static int c=200;
		
		//멤버 내부클래스의정의
		class InnerC{
			public void pData() {
				System.out.println("int a="+a);
				System.out.println("private int b="+b);
				System.out.println("static int c="+c);
			}
		
		}

public static void main(String[] args) {
	MemberInner MI=new MemberInner();
	
	MemberInner.InnerC IC=MI.new InnerC();
	IC.pData();
	
	}

}
