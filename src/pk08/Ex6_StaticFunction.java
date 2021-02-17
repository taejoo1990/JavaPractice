package pk08;

public class Ex6_StaticFunction {
	String str1="일반 멤버변수";
	static String str2="Static 변수"; // 공유
	
	public static String getString() {
		
		//return str1; //오류 :일반 멤버변수는 return이 안됨
		return str2;
	}

}
