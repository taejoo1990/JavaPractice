package pk13;

public class AnonyInner {
	
	//test() 함수
	public void test() {
		
		//익명의 클래스. 인터페이스를 생성한 것이기 떄문에 오버라이딩이 필수
		new TestInter() {
			
			public void printDate() {
				System.out.println("익명의 클래스 printDate()");
			}//추상메서드의 재정의
		}.printDate();//TestInter
	}
	

	public static void main(String[] args) {
		AnonyInner In=new AnonyInner();
		In.test();

	}

}
