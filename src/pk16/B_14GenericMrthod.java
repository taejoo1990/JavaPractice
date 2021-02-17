package pk16;

public class B_14GenericMrthod {
	//p1 : 가로(정수)-left 세로(소수점) -top
	//p2 : 가로(정수)-right 세로(소숫점)-bottom
	public static <T,V> double makeRectanglr(B_13Point<T,V> p1,B_13Point<T,V> p2) {
		//Number : 정수와 실수 타입 가능
		double left=((Number)p1.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		
		double right=((Number)p2.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
		//더블로 다운캐스팅 해도 되지만 더블밸류를 불러오기 위해서 Number로 다운캐스팅
		//여기서 넘버는 정수(int)와 소수(double)도 들어갈수있다
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}
	
	public static void main(String[] args) {
		
		B_13Point<Integer,Double> p1=new B_13Point<Integer,Double>(0,0.0);
		B_13Point<Integer,Double> p2=new B_13Point<Integer,Double>(10,10.0);

		double rect=B_14GenericMrthod.<Integer,Double>makeRectanglr(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 : "+rect+"입니다.");
		
	}

}
