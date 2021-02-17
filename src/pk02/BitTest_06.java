package pk02;

public class BitTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0B00000101; //5
		System.out.println(num);
		
		//20이 나오도록 왼쪽 쉬프트 00010100
		System.out.println(num<<2);
		//1이 나오도록 오른쪽 쉬프트 00000001
		System.out.println(num>>2);
		
		num=num<<2;
		System.out.println(num);

	}

}
