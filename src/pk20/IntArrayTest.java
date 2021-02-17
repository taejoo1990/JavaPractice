package pk20;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		int sumVal=Arrays.stream(arr).sum();
		
		System.out.println("stream_1 : "+sumVal);

		//�߸��� ������ ��(Error) (X)
		//int count=(int)stream(arr).count();
		
		//�ùٸ� ������ ��(��ü �ٽ� ����) (O)
		int count=(int)Arrays.stream(arr).count();//count�� long������ ���ֱ⿡ int������ �ٿ�ĳ����
		System.out.println("stream_2 : "+count);
		
	}

}
