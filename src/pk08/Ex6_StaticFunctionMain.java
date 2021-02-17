package pk08;

public class Ex6_StaticFunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		str=Ex6_StaticFunction.getString();
		//스테틱 메소드는 클래스명으로 외부에서 참조가 가능하다
		System.out.println("static 메소드 : "+str);

	}

}
