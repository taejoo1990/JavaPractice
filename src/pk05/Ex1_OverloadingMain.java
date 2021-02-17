package pk05;

public class Ex1_OverloadingMain {

	public static void main(String[] args) {
		//참조할수 있는 인스턴스 변수 즉 객체를 만들어 놓고 사용해야 한다.
		//int a=0;
		Ex1_Overloading  a=new Ex1_Overloading();
		//Ex1_Overloading에 메모리를 할당해 줘야 하기에 new를 적는다
		//기본 생성자를 통한 객체 생성
		a.getResult(65);//int
		a.getResult('a');//char
		a.getResult("글자");//String
		a.getResult(10, "숫자");//int, String
	}


}
