package pk09;

public class Main {

	public static void main(String[] args) {
		
		ChildExam c1=new ChildExam();
		
		//Child클래스에 있는 getCar호출
		System.out.println(c1.getCar());
		
		//자식이 부모의 재산을 모두 상속받음
		//부모로 부터 상속받은 돈을 호출
		System.out.println(c1.getMoney());
		
		//Child=Parent (연산자 : instanceof)
		//왼쪽의 객체가 오른쪽의 클래스의 인스턴스 변수인지를 확인
		if(c1 instanceof ParentExam)
			System.out.println("c1은 ParentExam의 자식이다");
		
		System.out.println("------------------------------------------");
		
		ChildExam c2=new ChildExam();
		ParentExam p1=new ParentExam();
		
		//자식을 부모에 대입
		//자식을 부모로 캐스팅
		//부모를 다시 자식으로 캐스팅
		p1=(ParentExam)c2;//UP캐스팅
		c2=(ChildExam)p1;//DOWN캐스팅
		//자식에 부모를 대입해도 자식은 자신의 기능을 포함해서 부모의 모든 기능을 사용할 수 있다
		System.out.println(c2.getCar());
		System.out.println(c2.getMoney());
		System.out.println(c2.getStr());
		System.out.println("-----------------------------");
		
		//반면
		p1=c2;//부모의 자식을 대입해도
		//부모의 기능만 사용할 수 있다.
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		//System.out.println(p1.getCar());
		//부모가 자식의 메소들를 사용하고 싶으면 아래처럼 캐스팅
		System.out.println(((ChildExam)p1).getCar());
	}

}
