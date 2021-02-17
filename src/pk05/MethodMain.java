package pk05;

public class MethodMain {

	public static void main(String[] args) {
		//창조하고 싶은 클래스의 메모리 객체를 생성(기본 생성자 이용)
		Method mh=new Method();
		
		mh.makeBread();
		
		System.out.println("---------------");
		mh.makeBread(5);
		
		System.out.println("---------------");
		mh.makeBread(5, "소시지");

	}

}
