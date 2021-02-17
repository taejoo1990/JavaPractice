package pk15;

public class A_02StringTest2 {

	public static void main(String[] args) {
		//hip메모리
		String javastr=new String("java");
		String androidstr=new String("android");
		
		System.out.println(javastr);
		System.out.println("문자열의 실제 hashCode 값 : "+System.identityHashCode(javastr));
		System.out.println(androidstr);
		System.out.println("문자열의 실제 hashCode 값 : "+System.identityHashCode(androidstr));
		
		javastr=javastr.concat(androidstr);//java+android
		//두개를 합칠경우 별도의 변수방으로 옮기기에 주소가 다르다
		System.out.println();
		System.out.println(javastr);
		System.out.println("연결된 문자열의 실제 hashCode 값 : "+System.identityHashCode(javastr));

	}

}
