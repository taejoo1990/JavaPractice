package pk07;

public class Person {
	
	String name;
	float height;
	float weight;
	
	//기본 생성자
	public Person() {
		name="익명";
		height=0;
		weight=0;
	}
	
	//이름만 생성자
	public Person(String a) {
		name=a;
		height=0;
		weight=0;
	}
	
	//이름 키 몸무게가 모두 세팅되는 생성자
	public Person(String a, int b, int c) {
		name=a;
		height=b;
		weight=c;
	}
	public void Disp() {
		System.out.println("이름은 : "+name+"입니다");
		System.out.println("키는 : "+height+"cm입니다");
		System.out.println("몸무게는 : "+weight+"kg입니다");
		
	}

}
