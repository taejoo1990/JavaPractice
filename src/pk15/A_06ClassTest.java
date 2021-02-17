package pk15;

public class A_06ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		A_05Person pe=new A_05Person();
		//유형1(Class의 객체를 만들어서 클래스의 풀네임을 알고싶을때)
		Class pClass1=pe.getClass();//Object 타입의 getClass()
		System.out.println("유형1(getClass()) : "+pClass1.getName());
		System.out.println();
		
		//유형2(Class의 객체를 만들어서 클래스의 풀네임을 알고싶을때)
		Class pClass2=A_05Person.class;//class->getClass()대신
		System.out.println("유형2(class) : "+pClass2.getName());
		
		//유형3 클래스 이름으로 가져오기
		//클래스 이름과 일치하지 않을경우 ClassNotFoundException 발생함
		Class pClass3=Class.forName("pk15.A_05Person");
		System.out.println("유형3(forName) : "+pClass3.getName());
		
		
	}

}
