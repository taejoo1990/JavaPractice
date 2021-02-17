package pk15;

public class A_04StringBuilderTest {

	public static void main(String[] args) {
		
		String javaStr=new String("java");
		System.out.println("javaStr 문자열의 주소 : "+System.identityHashCode(javaStr));
		
		StringBuilder builder=new StringBuilder(javaStr);
		//String로 부터 StringBuilder객체 생성
		
		//Builder의 메모리 주소
		System.out.println("연산 전 Builder의 메모리 주소 : "+System.identityHashCode(builder));
		builder.append(" and");
		builder.append(" Python");
		builder.append(" Programming is Fun!!");
		System.out.println("연산 후 Builder의 메모리 주소 : "+System.identityHashCode(builder));

		javaStr=builder.toString();//빌더를 스트링으로
		System.out.println(javaStr);
		System.out.println("javaStr 문자열의 주소 : "+System.identityHashCode(javaStr));
		//javaStr는 hip메모리이기에 주소가 변경
		
	}//스트링빌더같은경우 값을 계속추가해도 같은 위치에 메모리 주소가 계속 유지
		//빌딩 쌓을때처럼
	//버퍼는 하나만 쓸때 락

}
