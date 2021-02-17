package pk21;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		
		try (AutoCloseObj obj=new AutoCloseObj()){
			throw new Exception();//예외 발생
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}

		/*AutoCloseaObj obj1=new AutoCloseObj();
		
		try (obj1){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}*/
	}//자바9버전에서 부터 수행

}
