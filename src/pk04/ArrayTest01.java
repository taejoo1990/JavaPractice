package pk04;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*배열 선언
		int[] number1=new int[10];

		int number2[]=new int[10];
		int number3[];
		number3=new int[10];
		*/
		
		//배열 초기화
		//int[] number1=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//int[] number2=new int[10] {1,2,3,4,5,6,7,8,9,10};//오류
		//int[] number3={1,2,3,4,5,6,7,8,9,10}; //new int생략가능
		
		int[] number=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
		
	}

}
