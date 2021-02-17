package pk19;

interface PrintString{
	
	void showString(String str);
}


public class TestLambda {

	public static void main(String[] args) {

		PrintString lam=s->System.out.println(s);
		lam.showString("람다");//변수방 활용
		
		showMyString(lam);//메서드 활용
		
		//return 값이 있는 메서드
		PrintString restr=returnString();
		restr.showString("리턴하는");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("싫어");
	}

	public static PrintString returnString() {
		return s->System.out.println(s+" 이유는?");
	}
	
}
