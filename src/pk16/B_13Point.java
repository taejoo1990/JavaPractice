package pk16;

public class B_13Point<T,V> {

	//멤버변수
	T x;
	V y;
	
	//생성자 메서드
	B_13Point(T x, V y ) {
		this.x=x;
		this.y=y;
		
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	// 점 찍을때 왼위 오아 LTRB
	
}
