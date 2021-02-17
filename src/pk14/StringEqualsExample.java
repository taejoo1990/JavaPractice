package pk14;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1=new String("신민철");//객체
		
		String strVal2="신민철";//스텍메모리(일반 변수)

		if(strVal1==strVal2) {
			System.out.println("같은 String 객체를 참조");
		}
		else {
			System.out.println("같은 String 객체를 참조");
		}
		
		//논리적 데이터
		if(strVal1.equals(strVal2)) {
			System.out.println("같은 String 객체를 참조");
		}
		else {
			System.out.println("다른 String 객체를 참조");
		}
	}
	
}
