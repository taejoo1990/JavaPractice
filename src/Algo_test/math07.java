package Algo_test;

public class math07 {
	public static void main(String[] args) {

		int N = 1;
		long F = 1;
		long S = 0;

		while (N < 10) {
			N++;
			F = F * N;
			S = S + F; // S+=F;
			System.out.println(F + " * " + N);

		}
		System.out.println("ÃÑ ÇÕ : " + S);

	}
}
