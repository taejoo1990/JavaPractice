package pk11;

public class PhoneExample {

	public static void main(String[] args) {
		
		//직접접근은 안되고 자식을 통해서 접근이 가능하도록
		//Phone p=new Phone();//추상클래스는 객체를 만들수 없다 그러므로 보안의 효과가 있다
		
		SmartPhone sp=new SmartPhone("정현우");
		
		System.out.println(sp.owner+"님의 폰");
		sp.turnOn();
		sp.internetsearch();
		sp.turnOff();
		

	}

}
