package pk17.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr=new ArrayList<>();
		
		
		
		
		outer:while(true) {
			
			System.out.print("아이디 생성 : ");
			Scanner sc=new Scanner(System.in);
			
			//아이디를 입력할때마다 새로운 UserInfo
			UserInfo ui=new UserInfo();
			ui.setId(sc.next());
			
			//아이디 중복체크
			for (int i = 0; i < arr.size(); i++) {
				if(arr.get(i).getId().equals(ui.getId())) {//(ui.getid().equals(arr.get(i).getId())
					//리스트에 담겨져있는 아이디와 스캔으로 적은 아이디를 비교하여 중복시 제거
					System.out.println("아이디가 중복입니다.");
					continue outer;//중복될경우 아우터로 돌아가서 다시 반복수행
				}
					
			}
			
			System.out.print("비밀번호 생성 : ");
			ui.setPwd(sc.nextInt());
			
			arr.add(ui);
			
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("-----------------------------");
			}
			
		}
		
	}

}