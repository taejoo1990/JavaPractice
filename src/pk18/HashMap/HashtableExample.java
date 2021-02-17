package pk18.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		
		Map<String, String> map=new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id=sc.next();
			
			System.out.print("비밀번호 : ");
			String password=sc.next();
			System.out.println();
			
			if(map.containsKey(id)) {
				//만약에 메인에 내가 원하는 아이디가 있니?
				if(map.get(id).equals(password)) {
				//있다면 거기에 패스워드도 값이 같다면 아래를 출력할거야
					System.out.println("로그인 되었습니다.");
					break;
				}else {//패스워드가 맞지 않다면 아래를 출력할거야
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}//아이디가 틀리다면 이것을 출력할거야
		}
	}
}
