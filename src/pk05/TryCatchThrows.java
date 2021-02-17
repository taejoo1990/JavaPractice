package pk05;

public class TryCatchThrows {

	public static void fun() throws Exception{
		//선언시에는 throws로 메모리 할당시에는 throw로 적는다
		//throws 다음에 코딩된 예외처리 부분으로 던진다라는 뜻을 가지고 있다
		try {
			System.out.println("fun()메소드");
			throw new Exception();//키워드 new를 사용허여 예외 발생
			//RuntimeException : 실행중에 발생되는 에러로 Exception처리를
		} catch (RuntimeException e) { //못하므로 반드시 finally로 넘겨 줘야함
			System.out.println("예외발생");
		}finally {
			System.out.println("finally 문장인");
		}//finally를 쓸경우 무조건 실행해야한다		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fun();
		
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()dml catch문 영역");
		}
		
		
		
	}//main close
}//class close
