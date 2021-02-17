package pk14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now=new Date();
		
		//기본적인 날짜 표기타입
		System.out.println(now);
		
		//String strNow1=(string)now; //다운캐스팅이 안됨
		String str="Hi".toString();//toString 이미 오버라이딩이 되어 있음
		System.out.println(str);
		
		String strNow1=now.toString();//Data--> String
		System.out.println("---------Date--------");
		System.out.println("오늘의 날짜 : "+strNow1);

		SimpleDateFormat sdt=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//폼을 정해놓을시 폼에 맞춰서 들어간다 필요없는 부분은 생략하면 출력안됨
		String strnow2=sdt.format(now);//Date-->String
		System.out.println("---------SimpleDateForm--------");
		System.out.println(strnow2);
		
	}

}
