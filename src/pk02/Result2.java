package pk02;

public class Result2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//원의 넓이를 구하시오 (반지름* 반지름 * 3.14) : 반지름은 10
		
		/*int a=10;         내가 한거
				
		float c=a * a * 3.14f;
		System.out.println(c + "cm");*/
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이:" + var4);

	}

}
