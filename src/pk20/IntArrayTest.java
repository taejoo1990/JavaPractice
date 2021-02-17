package pk20;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		int sumVal=Arrays.stream(arr).sum();
		
		System.out.println("stream_1 : "+sumVal);

		//잘못된 재사용의 예(Error) (X)
		//int count=(int)stream(arr).count();
		
		//올바른 재사용의 예(객체 다시 생성) (O)
		int count=(int)Arrays.stream(arr).count();//count는 long형으로 되있기에 int형으로 다운캐스팅
		System.out.println("stream_2 : "+count);
		
	}

}
