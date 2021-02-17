package Algo_test;

public class Algo_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 1;
		int sw = 1;
		do {
			sum = sum + sw * n;

			if (n < 100) {
				n = n + 1;
				sw = -sw;
			} else
				break;
		} while (true);
		System.out.println("교차 수열의 합 : " + sum);

	}

}
