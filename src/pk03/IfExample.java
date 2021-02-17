package pk03;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아이디는 java /비밀번호는 12345인 학생이 ID pw를 입력했을때 맞으면 "로그인 성공"
		// 아이디는 맞고 비번이 틀리면 "로그인 실패 : 비밀번호가 틀렸습니다"
		// 아이디 비번이 다 틀리면 "로그인 실패 : 아이디가 존재하지 않습니다"
		String id = "java";
		int pw = 12345;
		Scanner scanner = new Scanner(System.in);

		System.out.println("아이디 : ");
		String name = scanner.nextLine();

		System.out.println("패스워드 : ");
		String strpassword = scanner.nextLine();

		int password = Integer.parseInt(strpassword);

		if (name.equals(id)) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 비밀번호가  틀렸습니다");

			}

		} else {
			System.out.println("로그인 실패 : 아이디가 존재하지 않습니다");
		}

	}

}
