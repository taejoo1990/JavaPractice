package pk01;

public class Constant {

	public static void main(String[] args) {
		// 상수값
		
		final int MAX_NUM=100;
		final int MIN_NUM;
		
		MIN_NUM=0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM=1000;  //ERROR : 상수값이므로 다른 값이 대입될수 없음

	}

}
