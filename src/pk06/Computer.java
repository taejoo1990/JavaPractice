package pk06;

public class Computer {

	int sum1(int[] values) {

		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		
		return sum;
	}
		//정수형 매개변수
		int sum2(int ...values) {
			int sum=0;
			for(int i=0;i<values.length;i++) {
				sum+=values[i];
			}
			return sum;
		}

	}