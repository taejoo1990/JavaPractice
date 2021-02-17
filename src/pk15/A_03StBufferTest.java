package pk15;

public class A_03StBufferTest {

	public static void main(String[] args) {
		
		
		String str="";
		//String Buffer 객체생성
		StringBuffer buf=new StringBuffer("Nice Day! ");
		
		//StringBuffer 문자열을 String으로 전환
		System.out.println(buf.toString());
		//StringBuffer 문자열의 크기(길이)
		System.out.println(buf.length());//글자 갯수 (공백포함)
		//StringBuffer의 용량
		System.out.println(buf.capacity());
		//StringBuffer의 용량 증가(기존 맥시멈 용량의 두배에 2를 더한것과 같음)
		buf.ensureCapacity(30);
		System.out.println(buf.capacity());
		//StringBuffer에 새로운 문자열 추가
		buf.insert(0, "Hi! ");
		buf.insert(14, "Everybody!");
		System.out.println(buf);
		//StringBuffer  문자열의 일부내용제거
		buf.delete(0, 4);
		System.out.println(buf);
		
	}

}
