package pk04;

import java.util.concurrent.SynchronousQueue;

public class ArraySumtest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores= {83,90,87};
		int sum=0;
		//���

		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		//for���� �̿��Ͽ� ����
		System.out.println("-------");
		for(int j=0;j<scores.length;j++){
			sum+=scores[j];
		}
		System.out.println("�� �� : "+sum);
		double avg=(double)(sum/scores.length);
		System.out.println("�� �� : "+ avg);
		System.out.println(String.format("�� �� : %.2f", avg));
		//�ݿø�                                                         ���� �Ҽ���@������ ǥ��
		System.out.println("�� ��(round) : "+Math.round(avg));

	}

}
