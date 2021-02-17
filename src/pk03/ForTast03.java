package pk03;

public class ForTast03 {

	public static void main(String[] args) {
		// 1~10까지의 합

		int i; // 인덱스 변수
		int sum = 0;

		for (i = 1; i <= 10; i++) {//위에 int i를 선언했기에 for에서
			sum += i;              //인트를 선언 하면 안된다
		//for (i = 0; i < 10; i++) 위와 같다
		//sum +=(i+1);
		}
		System.out.print("1부터 10까지의 합은" + sum + "입니다");

	}

}
