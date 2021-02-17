package pk14;

public class EqualsTest {

	public static void main(String[] args) {

		
		//hashCode=주기억장치 주소
		Student studentLee=new Student(100, "이주희");//아래와 각각 다른 주소
		Student studentLee2=studentLee;
		Student studentHee=new Student(100, "이주희");
		//toString를 사용할경우 주소가 아닌 입력값이 나오고 toString을 사용하지 않을 떄는 주소가 나옴
		/*
		System.out.println(studentLee);
		System.out.println(studentLee2);
		System.out.println(studentHee);*/
		
		//동일한 주소의 두 인스턴스 비교
		System.out.println("동일한 주소의 두 인스턴스 비교");
		if(studentLee==studentLee2)
			System.out.println("studentLee의 주소는 studentLee2의 주소와 같다");
		else
			System.out.println("studentLee의 주소는 studentLee2의 주소와 다르다");
	
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee의 데이터는 studentLee2와 같다");
		else
			System.out.println("studentLee의 데이터는 studentLee2와 다르다");
		
		
		//주소는 다르고 두 인스턴스 값은 같음
		System.out.println("주소는 다르고 두 인스턴스 값은 같음");
		if (studentLee == studentHee)
			System.out.println("studentLee의 주소는 studentHee의 주소와 같다");
		else
			System.out.println("studentLee의 주소는 studentHee의 주소와 다르다");

		if (studentLee.equals(studentHee))
			System.out.println("studentLee의 데이터는 studentHee와 같다");
		else
			System.out.println("studentLee의 데이터는 studentHee와 다르다");
	
		//hashCode의 값 출력
		System.out.println("********hashCode의 값 출력*******");
		System.out.println("studentLee의 hashCode : "+studentLee.hashCode());
		System.out.println("studentHee의  hashCode : "+studentHee.hashCode());
		System.out.println();
		
		//hashCode의 실제값 확인하는 메서드
		System.out.println("********hashCode의 실제값 확인하는 메서드*******");
		System.out.println("studentLee의 실제 hashCode : "+System.identityHashCode(studentLee));
		System.out.println("studentHee의 실제 hashCode : "+System.identityHashCode(studentHee));
		System.out.println();
		
		String str1=new String("test");
		String str2=new String("test");//hashCode가 재정의 되어 있음
		//hashCode의 재정의 되어있는 String
		System.out.println("********hashCode의 재정의 되어있는 String*******");
		System.out.println("studentLee의 실제 hashCode : "+str1.hashCode());
		System.out.println("studentHee의 실제 hashCode : "+str2.hashCode());
		System.out.println();
		
		
		//hashCode=주기억장치 주소
		
	
	}

}
