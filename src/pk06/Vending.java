package pk06;

public class Vending {
	// 필드
	private Can[] can = new Can[5];// 배열객체
	// 5개의 배열을 만들어 줄거야
	private int money;// 고객의 돈

	// 생성자

	// 초기화 메서드(생성자를 그룹화)
	public void init() {
		// 객체의 초기화
		can[0] = new Can("에스프레소", 800);
		can[1] = new Can("아메리카노", 900);
		can[2] = new Can("카페라떼", 1000);
		can[3] = new Can("바닐라라떼", 1100);
		can[4] = new Can("카라멜마끼아또", 1200);
	}
	// for->if

	public void showCans(int m) {
		money = m;

		for (int i = 0; i < can.length; i++) {
			// i를 하나 씩 추가하면서 can이랑 비교할거야
			if (can[i].getPrice() <= money) {// money보다getPrice작거나 같으면 음료와 이름과 가격을 보여주는
				// can클래스에서 가져와서 money랑 비교할거야
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice());
			} // 돈을 투입한거 이하로 보여줄거야
				// 에스프레소-800원 /카페라떼-1000원 /아메리카노-900원
		}
	}
	// out Can() 메서드 추가

	public void outCan(String name) {

		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "를 선택하셨습니다.");

				System.out.println("잔액 : " + (money - can[i].getPrice() + "원"));
			}
		}
	}

}
