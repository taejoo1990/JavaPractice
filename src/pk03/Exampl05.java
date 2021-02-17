package pk03;

public class Exampl05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while : rendom함수를 이용하여 임의의 두수를 추출 -> 두수의 합이 5가 되면 멈추게 구현
				while (true) {
					int num = (int) (Math.random() * 6) + 1;
					int sum = (int) (Math.random() * 6) + 1;
					System.out.println(num + "+" + sum + "=" + (num + sum));
					if (num + sum == 5) {
						break;
					}
				}

	}

}
