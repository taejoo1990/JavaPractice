package Algo_test;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double P = 2;
		double N = 3;

		while (N <= 100) {
			int M = (int) Math.sqrt(N);
			// 제곱근을 물어보는 단어
			int i = 2;

			while (i <= M) {
				if (N % i == 0)
					break;
				else {
					i++;
					if (i > M)
						P = N;
				}
			}
			N++;

		}
		System.out.println(P);
	}

}
