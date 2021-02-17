package pk04;

import java.util.concurrent.SynchronousQueue;

public class ArraySumtest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores= {83,90,87};
		int sum=0;
		//출력

		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		//for문을 이용하여 총합
		System.out.println("-------");
		for(int j=0;j<scores.length;j++){
			sum+=scores[j];
		}
		System.out.println("총 점 : "+sum);
		double avg=(double)(sum/scores.length);
		System.out.println("평 균 : "+ avg);
		System.out.println(String.format("평 균 : %.2f", avg));
		//반올림                                                         위는 소수점@개까지 표현
		System.out.println("평 균(round) : "+Math.round(avg));

	}

}
