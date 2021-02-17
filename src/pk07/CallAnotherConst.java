package pk07;


class Person2{
	//필드
	String name;
	int age;
	
	public Person2() {//Person2(String name, int age)
		this("이름없음",1);//위에꺼를 호출
	}//여기서 디스는 나 외의 다른 생성자를 읽으라는 뜻
	//기본값을 정하고 출력
	
	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
	}//기본값을 변경후 출력
	Person2 returnSelf() {
		return this; //Person2로 들어가서 기본생성자를 읽어
	}

}

public class CallAnotherConst {
	
	public static void main(String[] args) {
		Person2 noname=new Person2();
		System.out.print(noname.name+", ");
		System.out.print(noname.age);
		
		System.out.println();
		Person2 p=noname.returnSelf();
		System.out.print(p.name+", ");
		System.out.print(p.age);

	}

}
