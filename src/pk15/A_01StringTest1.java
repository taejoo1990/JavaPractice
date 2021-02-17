package pk15;

public class A_01StringTest1 {

	public static void main(String[] args) {
		//hip메모리에 객체가 생성
		String str1=new String("abc");
		String str2=new String("abc");
		//데이터는 같지만 주소가 다르다
		System.out.println(str1==str2);
		//내용이 같은지 비교
		System.out.println(str1.equals(str2));
		//주소가 같은지 비교
		
		System.out.println();
		//문자열은 상수값으로 데이터영역에 고정된 주소 사용(상수풀)
		//불변(immutable)
		String str3="abc";
		String str4="abc";
		//데이터와 주소가 같다
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}

}
