package pk03;

public class IfExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=2;
		
		if(age>=8) {
			System.out.println("학교에 다닙니다");
			System.out.println("초등학교 3학년 입니다");
		}
		else {//{}이게 없을경우 두줄이상은 중복 오류로 출력되지 않음
			System.out.println("학교에 다니지 않습니다");
			System.out.println("2살 입니다");
		}

	}

}
