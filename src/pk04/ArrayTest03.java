package pk04;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		//�Ҽ��� ǥ���ϴ� ����(����)�� �����̸� sum�� 0���� �ʱ�ȭ�Ѵ�.
		double[] date=new double[5];
		//�Ҽ��� ǥ���ϴ� ����(����)�� ���� 1���� �ƴ϶�
		//[]�ȿ� �� ��ŭ ���ž�
		//�����̸��� date = �� �����ȿ��� 5���� ���ڰ� ���ž�.
		//date[0,1,2,3,4]
		
		//int[] date=new int[5];
		
		
		
		date[0]=10.0;
		date[1]=20.0;
		date[2]=30.0;

		for(int i=0;i<date.length;i++) {
			sum=sum+date[i]; //sum+=date[i];
			System.out.println(date[i]);
		}
		System.out.println("------");
		System.out.println(sum);
	}

}
