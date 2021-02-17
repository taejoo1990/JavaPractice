package pk01;

public class Casting {

	public static void main(String[] args) {
		//프로모션 (큰자료형 -> 자료형)
		double d=100.5; // 8byte
		int n=200; // 4byte
		d=n;
		
		System.out.println("d : "+ d);
		
		//디모션(작은자료형-> 큰자료형)
		char c='B'; //2byte ASCII : 66
		int m=c+1;  //4dyte ASCII : 67
		c=(char)m;  //프로모션
		System.out.println("c : "+c);
		

	}

}
