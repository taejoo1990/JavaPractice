package pk05;

public class FunTest04 {

	//call by velue : "값에 의한 호출"
	
	public static void swap(int x, int y) {
		
		int temp =x;
		x=y;
		y=temp;
	}
	
	public static void main(String[] args) {

		int a=10;//지역변수 (로컬변수) :이 지역 안에서 활동하는 변수
		int b=20;
		
		System.out.println("swap() 호출전 : a="+a+" , b="+b);
		swap(a,b);//교환 성공(값만 넘겨 주고 사라짐)
		//스왑으로 인해 바깥 메모리를 호출함
		System.out.println("swap() 호출전 : a="+a+" , b="+b);
		//자신의 주소를 읽음

	}

}
