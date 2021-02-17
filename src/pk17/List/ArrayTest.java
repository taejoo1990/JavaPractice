package pk17.List;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		int iArray[]= {50,40,30,20,10};
		String sArray[]=new String[5];
		
		System.out.println(iArray);
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);//sort일 경우 오름차순 기본
		System.out.println(Arrays.toString(iArray));
		
		System.out.println(sArray);
		Arrays.fill(sArray, "Hi!");
		System.out.println(Arrays.toString(sArray));
		
		List<String> City=Arrays.asList("서울","인천","부산","대구","제주");
		for(int i=0;i<City.size();i++) {
			System.out.println(City.get(i).toString());
													//toString은 생략해줘도 됨
		}
		
	}

}
