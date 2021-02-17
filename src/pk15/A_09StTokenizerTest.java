package pk15;

import java.util.StringTokenizer;

public class A_09StTokenizerTest {

	public static void main(String[] args) {
		
		String str="Have a Nice Day";//상수
		
		
		//StringTokenizer(자르고 싶은 문자열, 자르는 기준이 되는 문자,
		//자르는 기준을 넣을지 말지(true, false))
		//StringTokenizer의 객체
		
		StringTokenizer obj=new StringTokenizer(str," ",false);
		
		//obj.hasMoreTokens(); //다음 토큰 존재 확인
		//obj.nextToken();//다음 토큰을 받아옴
		
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}
		
	}

}
