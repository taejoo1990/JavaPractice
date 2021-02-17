package pk03;

public class SwitchCase06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// random : 8~18시
		// 8 : 출근, 9 :회의, 10 : 업무, 16 : 외근, 18 : 퇴근
		int time = (int) (Math.random() * 8) + 10;

		System.out.println("[현재시간] : " + time + "시");

		switch (time) {
		case 8:
			System.out.println("출근");
			break;
		case 9:
			System.out.println("회의");
			break;
		case 10:
			System.out.println("업무");
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		case 16:
			System.out.println("외근");
			break;
		case 17:
			break;
		case 18:
			System.out.println("퇴근");
			break;
		default:
			System.out.println("업무 외의 시간입니다");
		}

	}

}
