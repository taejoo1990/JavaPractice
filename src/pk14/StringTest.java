package pk14;

public class StringTest {

	public static void main(String[] args) {
		String str="";
		String str1="Hi everyBoby!";//2
		String str2="Haver a nice Day!";//3
		
		str=str1+str2;
		System.out.println(str);
		//문자 이어서 출력
		System.out.println(str1.concat(str2));
		
		System.out.println("str1글자수 : "+str1.length());
		System.out.println("str2글자수 : "+str2.length());

		System.out.println("str1글자위치 : "+str1.indexOf('B'));
		System.out.println("str2글자위치 : "+str2.indexOf('D'));

		System.out.println("str1모두 소문자로 : "+str1.toLowerCase());
		System.out.println("str2모두 대문자로 : "+str2.toLowerCase());
		System.out.println(str1.substring(0,2));//0부터 시작해서 2까지 읽는다
		System.out.println(str1.substring(3,12));//3부터 시작해서 12까지 읽는다
		System.out.println(str2.substring(8,12));//8부터 시작해서 12까지 읽는다
	}

}
