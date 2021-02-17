package pk05;

//Call by Reference : '주소 참조에 의한 호출'
public class FunTest05 {

	//필드
	int value;
	
	//생성자 
	public FunTest05(int value) {
		this.value=value;
	}//다른 곳에서 클래스를 불러주기 위해서는  public클래스를 적어준다
	//다른 곳에서 패키지를 불러주기 위해서는 패키지를 임포트 해야된다
	
	//메소드
	public static void swap(FunTest05 x, FunTest05 y) {
		int temp=x.value;//위와 같은걸 인스턴트 변수라한다(모든걸 사용할수 있는 객체)
		x.value=y.value;
		y.value=temp;
	}
	
	public static void main(String[] args) {
		
		FunTest05 a=new FunTest05(10);//x를 끌어온 주소
		FunTest05 b=new FunTest05(20);//y를 끌어온 주소
		
		System.out.println("swap() 호출전 : a="+a+" , b="+b);
		//객체의 주소
		System.out.println("swap() 호출전 : a="+a.value+" , b="+b.value);
		//객체의 주소 안에 값을 출력하기 위해서는 .value를 적어줘야한다
		swap(a,b);
		System.out.println("swap() 호출전 : a="+a+" , b="+b);
		System.out.println("swap() 호출전 : a="+a.value+" , b="+b.value);
	}

}
