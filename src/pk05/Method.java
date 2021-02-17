package pk05;

//Method Overloading
public class Method {
	
	//필드
	//생성자(기본생성자)
	
	// public은 생략이 가능하다
	void makeBread() {
		System.out.println("빵을 만들었습니다");
	}//method1 close

	void makeBread(int count) {

		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 빵이 나왔습니다");
		} // count숫자를 정해줄것이기에 랭스를 사용 안해도 됨
		System.out.println();
		System.out.println("요청하신" + count + "개의 빵을 완성하였습니다.");
	}//method2 close

	void makeBread(int count, String name) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 " + name + " 빵이 나왔습니다");
		}
		System.out.println();
		System.out.println("요청하신 " + count + " 개의 " + name + "빵을 완성하였습니다.");
	}//method3 close

}//class close
