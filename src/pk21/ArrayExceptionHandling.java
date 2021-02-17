package pk21;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		
		//오류 발생
		/*for(int i=0;i<=5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("에러발생");*/
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리부분");
			
		}finally {//에러가 나던 안나던 무조건 수행됨
			System.out.println("Finally");
		}
		System.out.println("프로그램 종료");
	}

}
