package pk03;

public class Exampl04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for : 1부터100까지의 수중 3의 배수의 합
		int i = 0;
		int sum = 3;

		for (i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("1~100까지의 수중 3의 배수의 합은 : " + sum);

	}

}
