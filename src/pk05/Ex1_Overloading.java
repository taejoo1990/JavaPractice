package pk05;

public class Ex1_Overloading {
	
	//필드생략
	//생성자
	//메소드(Overloading) : '중복정의' 하나의 클래스에 동일한 이름의 메소드가 존재
	//Overloading(다형성): 유지보수 관리의 효율성 극대화	  //매개변수만 다르게 한다.
	public void getResult(int n) {
		System.out.println(n + "은(는) int 입니다.");
	}
	
	public void getResult(char n) {
		System.out.println(n + "은(는) char 입니다.");
	}
	
	public void getResult(String n) {
		System.out.println(n + "은(는) String 입니다.");
	}
	
	public void getResult(int n, String str) {
		System.out.println(n + "은(는) int " + str + "은(는) String");
	}

}
